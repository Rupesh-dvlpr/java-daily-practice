package CustomException;

/**A banking system prevents users from withdrawing more money than their account balance.
If a withdrawal request exceeds the balance, a custom exception InsufficientBalanceException should be thrown.

Requirements
Create a class InsufficientBalanceException with a message:
InsufficientBalanceException: Cannot withdraw Rs. <amount>, balance Rs. <balance>

Implement a method:
withdraw(int balance, int amount)
Throws the exception if amount > balance
Otherwise, withdrawal succeeds

Handle the exception in main()
Print a success message only if withdrawal is valid

Input Example
balance = 10000
withdrawAmount = 15000

Expected Output
InsufficientBalanceException: Cannot withdraw Rs. 15000, balance Rs. 10000*/


import java.util.*;

public class CustomExceptionClass {
    public static void main(String[] args) {
        int balance = Integer.parseInt(IO.readln("Enter your account balance: "));
        int withdraw = Integer.parseInt(IO.readln("Enter amount to withdraw: "));

        new Bank(balance, withdraw).withdraw();
        
    }
}

class InsufficientBalanceException extends Exception{
    
}

class Bank {
    private int balance; 
    private int withdraw;

    Bank(int balance, int withdraw){
        this.balance = balance;
        this.withdraw = withdraw;
    }

    public void withdraw(){
        try{
            if(withdraw <= balance){
                IO.println("Withdrawal successful");
            }else{
                throw new InsufficientBalanceException();
            }
        }catch(InsufficientBalanceException e){
            IO.println("InsufficientBalanceException: Cannot withdraw Rs. " + withdraw + ", balance Rs. " + balance);
        }
    }
}

