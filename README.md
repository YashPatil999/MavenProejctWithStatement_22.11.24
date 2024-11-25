Student Management Application:

This project is a Java-based Student Management Application that connects to a MySQL database to perform CRUD (Create, Read, Update, Delete) operations using Statement on student records. Below is a detailed explanation of the code and its functionality.

Code Explanation:

1. Main Method:

The main method in the Student class serves as the entry point of the application. It sequentially calls the CRUD operations:
insertData()
updateData()
deleteData()
fetchAllData()

2. CRUD Methods

Each method connects to the database using JDBC, executes the corresponding SQL command, and closes the connection.

Insert Data (insertData): Inserts a new student record with pre-defined values.

Update Data (updateData): Updates the name and age of a student identified by sid.

Delete Data (deleteData): Deletes a student record based on the sid.

Fetch All Data (fetchAllData): Retrieves all student records and prints them to the console.
