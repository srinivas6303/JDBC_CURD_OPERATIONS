import Entity.Employee;
import Methods.CurdMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String username = "root";
        String password = "Srinu@4848";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";

        try {
            // Load the driver (you can uncomment this if needed)
            // Class.forName(driver);

            
            Connection connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connected to the database successfully!");
            }

            // Initialize the CurdMethods instance with the established connection
            CurdMethods curdMethods = new CurdMethods(connection);


            Employee e = new Employee();
            e.setId(104);
            e.setName("viswa");
            e.setSalary(30000);
            e.setDept("SQLDEV");

            //save
            curdMethods.save(e);
            curdMethods.findAll();

            //update
            e.setId(104);
            e.setName("Psvk Viswas");
            e.setSalary(30000);
            e.setDept("Developer");
            curdMethods.update(e);
            curdMethods.findAll();

            //delete
           curdMethods.delete(104);
           curdMethods.findAll();

           //getById
           curdMethods.getById(101);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
