# HW to Chapters 13 “Connect Java Program to Database” (as in lectures)

Non-programming Assignment:<br>

1) What is JDBC?<br>

JDBC stands for Java Database Connectivity. It is an API (Application Programming Interface) that allows Java programs to interact with databases. JDBC provides methods and interfaces to connect to a database, send queries, and retrieve results.<br>

2) How to write information to a file?<br>

To connect a Java program to a database using JDBC, you need to follow these steps:<br>

Step 1: Load and register the database driver using Class.forName().<br>
Step 2: Establish a connection to the database using DriverManager.getConnection(), providing the database URL, username, and password.<br>
Step 3: Create a statement object (Statement or PreparedStatement) from the connection to execute SQL queries.<br>
Step 4: Execute SQL queries using the statement object (executeQuery() for retrieving data, executeUpdate() for data manipulation).<br>
Step 5: Process the results obtained from the queries.<br>
Step 6: Close the connection and statement objects using close() to release resources after use.<br>