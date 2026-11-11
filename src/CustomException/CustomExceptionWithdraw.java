package CustomException;
/*You are developing a Java banking application that allows a user to withdraw money from their account.
The program maintains an account balance and processes withdrawal requests.

If the user attempts to withdraw an amount greater than the available balance, the program should throw a custom exception called InsufficientFundsException.
If the withdrawal amount is less than or equal to the balance, the withdrawal should succeed and the remaining balance should be displayed.

This program demonstrates how to create and use custom exceptions in Java to handle real-world business logic scenarios.
Read account balance from user
• Read withdrawal amount
• Create a custom InsufficientFundsException
• Throw exception if withdrawal exceeds balance
• Display success message for valid withdrawal

Input Format
--------------------
First line: Account balance
Second line: Withdrawal amount

Output Format
--------------------
If withdrawal exceeds balance:
InsufficientFundsException: Withdrawal amount exceeds account balance

If withdrawal is successful:
Withdrawal successful. Remaining balance: amount**/
import java.util.*;

public class CustomExceptionWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance;
        double withdraw;
          try(sc){
            balance = sc.nextDouble();
            withdraw = sc.nextDouble();
            if(balance >= withdraw){
                System.out.println("Withdrawal successful. Remaining balance: "+(balance-withdraw));
            }else{
                throw new InsufficientFundsException("Withdrawal amount exceeds account balance");
            }
       
        }catch(InsufficientFundsException e){
            System.out.println(e);
        }finally {
        	sc.close();
        }
      
        
    }
}


class InsufficientFundsException extends Exception{
    InsufficientFundsException(){

    }

    InsufficientFundsException(String msg){
        super(msg);
    }
}
