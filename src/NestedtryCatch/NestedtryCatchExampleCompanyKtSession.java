package NestedtryCatch;

/*You are required to design a Company Knowledge Transfer (KT) Session scheduling system using nested try–catch blocks in Java.
Program Design Specifications:
Class Design
Create a class named KTSession responsible for handling KT session scheduling logic.
The main method will control program execution and user input handling.
Instance Variables
String trainerName -> Stores the name of the trainer assigned to the KT session.
int duration -> Stores the duration of the KT session in hours.
Method Responsibility
Implement the KT scheduling logic inside the main method using nested try–catch blocks.
The logic must validate trainer availability and session duration.
Nested Try–Catch Structure
Outer try block:
Reads the trainer name from the user.
Validates that the trainer name is not null.
Handles NullPointerException if the trainer is not assigned.
Inner try block:
Reads and validates the session duration.
Throws an ArithmeticException if the duration is less than 1 hour.
Business Rules
A KT session must have a valid trainer assigned.
Session duration must be at least 1 hour.
If all validations pass, the KT session is scheduled successfully.
This design ensures trainer validation happens before session duration validation, clearly demonstrating the use of nested exception handling

Input Format
-------------------
First line: Trainer name (String)
Second line: Session duration (int)
Output Format
-------------------------
If trainer name and duration are valid:
KT session scheduled
If session duration is invalid:
Invalid session duration**/

import java.util.*;

public class NestedtryCatchExampleCompanyKtSession {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(sc){
            String name = sc.nextLine();
            if(name!=null){
                try{
                    int duration = sc.nextInt();
                    if(duration < 1){
                        throw new ArithmeticException("Invalid session duration");
                    }
                        IO.println("KT session scheduled");
                    
                }catch(ArithmeticException e){
                    IO.println(e.getMessage());
                }
            }
            
        }catch(NullPointerException e){
            IO.println(e.getMessage());
        }
        sc.close();
    }
}



