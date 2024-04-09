# HW to Chapters 13 “Connect Java Program to Database” (as in lectures)

Non-programming Assignment:
1) What is JDBC?
JDBC stands for Java Database Connectivity. It is an API (Application Programming Interface) that allows Java programs to interact with databases. JDBC provides methods and interfaces to connect to a database, send queries, and retrieve results.

2) How to write information to a file?
To connect a Java program to a database using JDBC, you need to follow these steps:

Step 1: Load and register the database driver using Class.forName().
Step 2: Establish a connection to the database using DriverManager.getConnection(), providing the database URL, username, and password.
Step 3: Create a statement object (Statement or PreparedStatement) from the connection to execute SQL queries.
Step 4: Execute SQL queries using the statement object (executeQuery() for retrieving data, executeUpdate() for data manipulation).
Step 5: Process the results obtained from the queries.
Step 6: Close the connection and statement objects using close() to release resources after use.