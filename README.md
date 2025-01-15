# CRUD Operations with JDBC in Java
This project demonstrates performing basic CRUD (Create, Read, Update, Delete) operations using JDBC in Java with MySQL as the database. <br>
The project uses IntelliJ IDEA as the IDE and the MySQL Connector/J for connecting Java to the MySQL database.<br>

## Project Structure 
The project consists of three main Java classes:<br>

**Employee.java**<br>
This class represents the Employee entity with the following fields:<br>
id (int): The unique identifier for an employee.<br>
name (String): The name of the employee.<br>
salary (int): The salary of the employee.<br>
dept (String): The department the employee belongs to.<br>

**CRUDMethods.java** <br>
This class contains methods to perform CRUD operations on the MySQL database:<br>
save(): Insert a new employee record.<br>
update(): Update an existing employee record.<br>
delete(): Delete an employee record by ID.<br>
getById(): Fetch an employee record by ID.<br>
findAll(): Retrieve all employee records from the database.<br>

**Main.java** <br>
This class contains the main() method where you can test the CRUD operations by creating instances of the CRUDMethods class and calling the respective methods.<br>

## Setup Instructions
**1. Install MySQL**<br>
Make sure MySQL is installed on your machine and running. Create a database named employee_db and a table called employee with the following structure:<br>

CREATE DATABASE employee_db;<br>
USE employee_db;<br>

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    salary INT,
    dept VARCHAR(255)
);<br>

**2. Configure JDBC Connection**<br>
In the CRUDMethods.java class, ensure you have the correct database connection URL, username, and password:<br>

String url = "jdbc:mysql://localhost:3306/employee_db";<br>
String username = "your_username";<br>
String password = "your_password";<br>
Make sure to replace your_username and your_password with the correct MySQL credentials.<br>

**3. Add MySQL Connector**<br>
Download the MySQL JDBC connector (or use the Maven dependency) and add it to your project.<br>
Maven dependency for the MySQL Connector/J:<br>
```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.29</version>
</dependency>
```

**4. Run the Project**<br>
Once you have set up the database and configured the connection, run the Main.java class to test CRUD operations.<br>
The operations will interact with the employee_db and perform actions such as adding, updating, retrieving, and deleting employee records.<br>

## CRUD Operations Overview
Save: Adds a new employee to the database.<br>
Update: Modifies the details of an existing employee.<br>
Delete: Removes an employee from the database using their ID.<br>
Get By ID: Fetches a specific employee's details using their ID.<br>
Find All: Retrieves all employees from the database.<br>

## Technologies Used
Java: The main programming language used to implement the CRUD operations.<br>
JDBC: For database connectivity.<br>
MySQL: Used as the relational database for storing employee records.<br>
IntelliJ IDEA: The integrated development environment used for writing and running the Java code.<br>

## Conclusion
This project provides a simple and effective demonstration of performing basic database operations using JDBC in Java. <br>
It can serve as a foundation for more complex applications that require persistent storage using a relational database.<br>
![Screenshot 2025-01-15 144759](https://github.com/user-attachments/assets/cbde51bb-2927-40d9-a65d-5583e68eb620)
