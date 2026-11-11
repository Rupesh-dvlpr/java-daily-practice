package CustomException;
/*A banking program allows users to enter a PIN for account access. If the user enters an incorrect PIN multiple times consecutively, the program should throw a custom exception (e.g., InvalidPinException).

Input Format
-------------------
Incorrect PIN Attempts: 3

Output Format
-----------------------
InvalidPinException: 3 incorrect PIN attempts

Additional Notes:
Entering the correct PIN within the allowed attempts grants access.
This demonstrates custom exception handling for security checks in Java applications.*/

import java.util.*;

public class CustomExceptionPasswordAttempt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int limit = 3;
        int password = 1234;
        int attempt;
        try(sc){
            for(int i=limit ; i>0; i--){
            	System.out.println("Enter your PIN: ");
                attempt = sc.nextInt();
                if(attempt == password){
                    System.out.println("Access granted. PIN correct");
                    System.exit(0);
                }else {
                	System.out.println("Incorrect PIN please try again... Attempts left: "+(i-1));
                }
            }
            throw new InvalidPinException("3 incorrect PIN attempts");
            }catch(InvalidPinException e){
            System.out.println(e);
        }

        }
        
    }


class InvalidPinException extends Exception{
    InvalidPinException(){

    }
    InvalidPinException(String msg){
        super(msg);
    }
}