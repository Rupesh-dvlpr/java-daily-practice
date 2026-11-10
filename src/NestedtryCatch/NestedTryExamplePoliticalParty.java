package NestedtryCatch;

/*You are required to simulate a political party election result system based on the number of campaign work hours completed by the party.
The program must use nested try–catch blocks to handle different types of errors and validations:
The outer try block should handle input reading and input type validation.
The inner try block should validate whether the campaign work hours are sufficient to win the election.
Election Rules:
If campaign work hours are 100 or more, the party wins the election.
If campaign work hours are less than 100, explicitly throw an ArithmeticException indicating the party loses due to insufficient work.
If the input type is invalid (non-numeric), catch an InputMismatchException.
**/
import java.util.*;

public class NestedTryExamplePoliticalParty {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int hours = sc.nextInt();
            
            try(sc){
                if(hours >= 100){
                    IO.println("Party wins the election");
                }else{
                    throw new ArithmeticException("Party loses due to insufficient work");
                }
            }catch(ArithmeticException e){
                IO.println(e.getMessage());
            }
            
        }catch(InputMismatchException e){
            IO.println("Invalid input type");
        }
        
    }
}

