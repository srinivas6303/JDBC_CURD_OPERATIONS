# CRUD Operations with JDBC in Java
This project demonstrates performing basic CRUD (Create, Read, Update, Delete) operations using JDBC in Java with MySQL as the database. 
The project uses IntelliJ IDEA as the IDE and the MySQL Connector/J for connecting Java to the MySQL database.

Project Structure
The project consists of three main Java classes:

Employee.java
This class represents the Employee entity with the following fields:
id (int): The unique identifier for an employee.
name (String): The name of the employee.
salary (int): The salary of the employee.
dept (String): The department the employee belongs to.

CRUDMethods.java
This class contains methods to perform CRUD operations on the MySQL database:
save(): Insert a new employee record.
update(): Update an existing employee record.
delete(): Delete an employee record by ID.
getById(): Fetch an employee record by ID.
findAll(): Retrieve all employee records from the database.

Main.java
This class contains the main() method where you can test the CRUD operations by creating instances of the CRUDMethods class and calling the respective methods.

Setup Instructions
1. Install MySQL
Make sure MySQL is installed on your machine and running. Create a database named employee_db and a table called employee with the following structure:

CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    salary INT,
    dept VARCHAR(255)
);

2. Configure JDBC Connection
In the CRUDMethods.java class, ensure you have the correct database connection URL, username, and password:

String url = "jdbc:mysql://localhost:3306/employee_db";
String username = "your_username";
String password = "your_password";
Make sure to replace your_username and your_password with the correct MySQL credentials.

3. Add MySQL Connector
Download the MySQL JDBC connector (or use the Maven dependency) and add it to your project.
Maven dependency for the MySQL Connector/J:

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.29</version>
</dependency>

4. Run the Project
Once you have set up the database and configured the connection, run the Main.java class to test CRUD operations.
The operations will interact with the employee_db and perform actions such as adding, updating, retrieving, and deleting employee records.

CRUD Operations Overview
Save: Adds a new employee to the database.
Update: Modifies the details of an existing employee.
Delete: Removes an employee from the database using their ID.
Get By ID: Fetches a specific employee's details using their ID.
Find All: Retrieves all employees from the database.



Technologies Used
Java: The main programming language used to implement the CRUD operations.
JDBC: For database connectivity.
MySQL: Used as the relational database for storing employee records.
IntelliJ IDEA: The integrated development environment used for writing and running the Java code.

Conclusion
This project provides a simple and effective demonstration of performing basic database operations using JDBC in Java. 
It can serve as a foundation for more complex applications that require persistent storage using a relational database.
![Screenshot 2025-01-15 144759](https://github.com/user-attachments/assets/cbde51bb-2927-40d9-a65d-5583e68eb620)
