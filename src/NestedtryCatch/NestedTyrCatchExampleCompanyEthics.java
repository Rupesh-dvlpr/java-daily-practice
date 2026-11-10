package NestedtryCatch;

/*You are required to design a simple Company Work Ethics validation program that checks whether an employee is following acceptable working hour limits.
Program Design Requirements:
Class Design
Create a main class that controls the execution of the program.
The program reads employee data and performs validation using nested try–catch blocks.
Instance Variable
Use an integer variable workingHours to store the number of hours worked by an employee in a day.
Method Responsibility
A validation logic must be implemented to check whether the employee’s working hours follow company rules.
This validation should be placed inside an inner try block.
Nested Try–Catch Logic
The outer try block is responsible for:
Reading input from the user
Handling invalid input types using InputMismatchException
The inner try block is responsible for:
Validating the working hours range
Throwing an ArithmeticException if the employee works more than the allowed limit
Work Ethics Rules:
Valid working hours must be between 0 and 12 hours.
If workingHours > 12, explicitly throw an ArithmeticException indicating overwork.
If the user enters an invalid input type (non-numeric value), catch InputMismatchException.
This structure separates input handling, business rule validation, and exception handling, making the program easy to understand and maintain

Input Format
--------------------
A single integer representing employee working hours.

Output Format
----------------------
If working hours are valid (0–12):
Work ethics maintained
If working hours exceed 12:
Overwork detected**/

import java.util.*;

public class NestedTyrCatchExampleCompanyEthics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(sc){
            int workingHours = sc.nextInt();
            try{
                if(workingHours > 0 && workingHours < 12){
                    IO.println("Work ethics maintained");
                }else{
                    throw new ArithmeticException("Overwork detected");
                }
            }catch(ArithmeticException e){
                IO.println(e.getMessage());
            }
        }catch(InputMismatchException e){
            IO.println("Invalid input type");
        }finally{
            sc.close();
        }
        
    }
}


