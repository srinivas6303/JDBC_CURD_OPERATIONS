package Methods;

import Entity.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CurdMethods {
    private Connection connection; // Instance variable for database connection

    // Constructor to initialize the connection
    public CurdMethods(Connection connection) {
        this.connection = connection;
    }

    //SAVE
    public void save(Employee e) {
        System.out.println("save method called!");
        String query = "INSERT INTO employee(id, name, salary, dept) VALUES (?, ?, ?, ?);";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, e.getId());
            preparedStatement.setString(2, e.getName());
            preparedStatement.setInt(3, e.getSalary());
            preparedStatement.setString(4, e.getDept()); // Corrected parameter index

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record is Inserted!");
            } else {
                System.out.println("Record not Inserted!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //DELETE;
    public void delete(int id) {
        System.out.println("delete method called!");
        String query = "delete from employee where id = ?";


        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record with ID " + id + " is deleted!");
            } else {
                System.out.println("Record with ID " + id + " not found!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //UPDATE
    public void update(Employee e) {
        System.out.println("update method called!");
        // Update query
        String updateQuery = "UPDATE employee SET name = ?, salary = ?, dept = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, e.getName());
            preparedStatement.setInt(2, e.getSalary());
            preparedStatement.setString(3, e.getDept());
            preparedStatement.setInt(4, e.getId());

            // Execute update and check if any rows were updated
            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Record Updated!");
            } else {
                // If no rows were updated, insert new record
                System.out.println("Record not found! Inserting new data...");
                save(e);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }




    //GETBYID
    public void getById(int id){
        System.out.println("getById method called!");
        String query="select * from employee where id =?";

        try(PreparedStatement preparedStatement=connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("NAME: " + resultSet.getString("name"));
                System.out.println("SALARY: " + resultSet.getInt("salary"));
                System.out.println("DEPT: " + resultSet.getString("dept"));
            }
            else{
                System.out.println("Record not found!");
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    //FINDALL
    public void findAll() {
        System.out.println("findAll method called!");
        String query = "SELECT * FROM employee";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if there are any records and print the data
            while (resultSet.next()) {

                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("NAME: " + resultSet.getString("name"));
                System.out.println("SALARY: " + resultSet.getInt("salary"));
                System.out.println("DEPT: " + resultSet.getString("dept"));
                System.out.println("====================================");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }



}