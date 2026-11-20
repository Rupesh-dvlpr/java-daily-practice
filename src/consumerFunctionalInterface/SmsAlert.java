package consumerFunctionalInterface;
/*In a banking system, customers must receive an SMS alert after every transaction. The SMS includes:
Customer name
Transaction amount
Remaining account balance

Requirement:
Write a Java program that:
Defines a Transaction class with fields for id, name, amount, and balance.
Uses Consumer<Transaction> to format and print an SMS alert.
Uses the .accept() method to process and send messages for all transactions.

Class and Method Structure:
Class: Transaction

Attributes:
int id
String name
int amount
int balance

Constructor:
Transaction(int id, String name, int amount, int balance)

Hint:
- Define a consumer like this:
Consumer<Transaction> sendSMS = t ->
System.out.println("SMS to " + t.name + ": Rs. " + t.amount + " debited. Balance: Rs. " + t.balance);

- Then call:
for (Transaction t : transactions) {
sendSMS.accept(t);
}*/
import java.util.*;
import java.util.function.Consumer;
public class SmsAlert {
    public static void main(String[] args) {
       int noOfTransaction = Integer.parseInt(IO.readln().trim());
       Transaction transactions[] = new Transaction[noOfTransaction];
       for(int i = 0; i<noOfTransaction;i++){
        int customerId = Integer.parseInt(IO.readln().trim());
        String customerName = IO.readln().trim();
        int transactionAmount = Integer.parseInt(IO.readln().trim());
        int balance = Integer.parseInt(IO.readln().trim());

        transactions[i] = new Transaction(customerId, customerName, transactionAmount, balance);
       }
       Consumer<Transaction> sendSMS = t ->{
        System.out.println("SMS to " + t.name() + ": Rs. "+t.amount()+" debited. Balance: Rs. "+t.balance());
       };

       for(Transaction transaction : transactions){
            sendSMS.accept(transaction);
       }
    }
}

record Transaction(int id, String name, int amount, int balance){}
