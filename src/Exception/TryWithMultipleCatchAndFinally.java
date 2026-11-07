package Exception;

/**Flipkart processes online payments securely and must handle unexpected user input and runtime errors gracefully.
You are required to develop a Java program that processes a payment transaction using try–catch–finally blocks.

The program must:
Accept payment details using Scanner
Perform validations and calculations inside a try block
Handle possible exceptions using appropriate catch blocks
Display a confirmation message in the finally block regardless of success or failure

Payment Rules
Supported Payment Methods
CARD, UPI, NETBANKING

Discount Rules
CARD → 5% discount
UPI → 10% discount
NETBANKING → No discount

Exception Handling Requirements

The program must handle:
InputMismatchException → Non-numeric amount input
IllegalArgumentException → Invalid payment method
ArithmeticException → Division by zero (if any calculation error occurs)
A generic Exception as fallback

Input Validation Rules
Payment amount must be greater than 0
Payment method must be valid

On validation failure, throw an appropriate exception

Input Format
Payment Amount
Payment Method

Output Format (REFERENCE)
Flipkart Payment Summary
------------------------
Payment Method: <method>
Payment Amount: <amount>
Discount Applied: <discount>
Final Amount Paid: <final>
Payment Status: SUCCESS
Thank you for shopping with Flipkart!*/


import java.util.*;

public class TryWithMultipleCatchAndFinally {
    public static void main(String[] args) {
        double amount = Double.parseDouble(IO.readln("Enter amount to make Payment: "));
        String paymentMethod = IO.readln("Enter payment method [UPI / NETBANKING / CARD]: ");

        
        Payment p = null;
        try{
        if(amount <= 0){
            throw new InputMismatchException();
        }    
        else if(paymentMethod.equalsIgnoreCase("NETBANKING")){
            p = new NetBanking(amount);
            p.makepayment();   
        }else if(paymentMethod.equalsIgnoreCase("upi")){
            p = new Upi(amount);
            p.makepayment();
        }else if(paymentMethod.equalsIgnoreCase("Card")){
            p = new Card(amount);
            p.makepayment();
        }else{
            throw new IllegalArgumentException();
        }
        }catch(InputMismatchException e){
            IO.println("Error: Unexpected error occurred. ");
        }catch(IllegalArgumentException e){
            IO.println("Error: Invalid payment method.");
        }finally{
            IO.println("Thank you for shopping with Flipkart!");
        }
    }
}

abstract class Payment{
   public abstract void makepayment();
}

class Card extends Payment{
   double amount;
   Card(double amount){
    this.amount = amount;
   }
   
     @Override
       public void makepayment(){
        IO.println("Flipkart Payment Summary");
        IO.println("------------------------");
        IO.println("Payment Method: CARD");
        IO.println("Payment Amount: "+amount);
        IO.println("Discount Applied: "+ (amount * 0.05));
        IO.println("Final Amount Paid: " + (amount - (amount * 0.05)));
        IO.println("Payment Status: SUCCESS");
    }
}

class Upi extends Payment{
   double amount;
   Upi(double amount){
    this.amount = amount;
   }
   
     @Override
       public void makepayment(){
        IO.println("Flipkart Payment Summary");
        IO.println("------------------------");
        IO.println("Payment Method: UPI");
        IO.println("Payment Amount: "+amount);
        IO.println("Discount Applied: "+ (amount * 0.1));
        IO.println("Final Amount Paid: " + (amount - (amount * 0.1)));
        IO.println("Payment Status: SUCCESS");
    }
}

class NetBanking extends Payment{
   double amount;
   NetBanking(double amount){
    this.amount = amount;
   }
   
     @Override
       public void makepayment(){
        IO.println("Flipkart Payment Summary");
        IO.println("------------------------");
        IO.println("Payment Method: NETBANKING");
        IO.println("Payment Amount: "+amount);
        IO.println("Discount Applied: 0.0");
        IO.println("Final Amount Paid: " + amount );
        IO.println("Payment Status: SUCCESS");
    }
}

