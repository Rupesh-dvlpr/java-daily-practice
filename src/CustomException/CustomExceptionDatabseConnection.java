package CustomException;

/*You are required to simulate a database connection system in Java using try-with-resources and a custom exception.

Program Design Requirements
1. Class Design
Create a custom exception class named DatabaseNotConnectedException.
Create a main class that controls input and connection validation.

2. Instance Variable
String databaseName
→ Stores the name of the database entered by the user.

3. Method Responsibility
The database connection logic must be placed inside a try-with-resources block.
The program checks whether the database name is valid before establishing a connection.

4. Exception Handling Logic
If the database name is "null":
Explicitly throw DatabaseNotConnectedException.
If the database name is valid:
Print a success message indicating a successful connection.

This problem demonstrates:
Creation and usage of custom exceptions
Safe resource handling using try-with-resources
Clean separation of validation and error handling logic

Input Format
--------------------
A single string representing the database name.

Output Format
------------------------
If the database name is valid:
Database connected successfully**/
import java.util.*;

public class CustomExceptionDatabseConnection  {
    public static void main(String[] args) {
       String databaseName;
        Scanner sc = new Scanner(System.in);
        try(sc){
            databaseName = sc.nextLine();
            if(databaseName == null || databaseName.isBlank()){
                throw new DatabaseNotConnectedException("Database not connected");
            }else{
                IO.println("Database connected successfully");
            }
        }catch(DatabaseNotConnectedException e){
            IO.println(e.getMessage());
        }finally{
            sc.close();
        }
        
    }
}

class DatabaseNotConnectedException extends Exception{
    DatabaseNotConnectedException()
    {

    }
    DatabaseNotConnectedException(String message){
        super(message);
    }
}
