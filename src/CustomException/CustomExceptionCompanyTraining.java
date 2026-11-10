package CustomException;
/*You are required to simulate a Company Training Session System 
that validates whether a training session is valid based on its duration.
The program must use a custom exception to handle invalid training durations and
ensure that company training standards are followed.
Program Design Requirements
1. Class Design
Create a custom exception class named TrainingInvalidException.
Create a main class to handle user input and training validation logic.
2. Instance Variable
int duration
→ Represents the duration of the training session in hours.
3. Method Responsibility
Read the training duration from the user.
Validate the duration based on company rules.
Throw a custom exception if the duration is invalid.
Print a success message if the duration is valid.
4. Exception Handling Logic
If duration < 2, explicitly throw TrainingInvalidException.
Catch the custom exception and display an appropriate error message.
This design helps separate business rule validation from normal execution flow.
Input Format
--------------------
A single integer representing the training duration (in hours).
Output Format
-----------------------
If the training duration is valid:**/
import java.util.*;

public class CustomExceptionCompanyTraining{
    
    public static void main(String[] args) {
        int duration;
       Scanner sc = new Scanner(System.in);
       try(sc){
            duration = sc.nextInt();
            try{
                if(duration < 2 || duration > 24){
                    throw new TrainingInvalidException("Training duration too short");
                }else{
                    IO.println("Training completed successfully");
                }
            }catch(TrainingInvalidException e){
                IO.println(e.getMessage());
            }
       }catch(InputMismatchException e){
        IO.println(e);
       }finally{
        sc.close();
       }

        
    }
}

class TrainingInvalidException extends Exception{
    TrainingInvalidException(){

    }
    TrainingInvalidException(String message){
        super(message);
    }
}
