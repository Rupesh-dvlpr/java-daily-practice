package exceptionWithResourceSafety;
/*You are required to validate the length of a password entered by the user.
- A password must have a minimum length of 6 characters to be considered valid.
- If the password length is less than 6 characters, t
he program should throw an exception indicating that the password is too short.
- If the password length is 6 or more characters, the program should display a validation success message.
This problem helps students understand basic input validation and how to use exceptions in programming.

Input Format
---------------------
- A single string representing the password entered by the user.
Example:
mypwd123

Output Format
-----------------------
- If the password length is valid (≥ 6 characters):
Password is valid
- If the password length is invalid (< 6 characters):
Exception: Password length must be at least 6 characters
*/
import java.util.*;

public class PasswordLengthExceptionExample{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String password;
       try(sc){
            System.out.println("Enter your password");
            password = sc.nextLine();
            if(password.length()<6){
                throw new PasswordLengthException("Password length must be at least 6 characters");
            }
            System.out.println("Password accepted");
       }catch(PasswordLengthException e){
        System.out.println(e.getMessage());
       }
        
    }
}

class PasswordLengthException extends Exception{
    PasswordLengthException(){

    }

    PasswordLengthException(String msg){
        super(msg);
    }
}