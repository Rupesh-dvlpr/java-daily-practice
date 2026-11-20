package PredicateFunctionInterface;
/*A bank wants to identify customers who are eligible for a personal loan.
Only customers with a credit score greater than 700 are eligible.
As a developer, your task is to write a Java program that filters the customer list and displays only those who meet the credit score criteria.
You are given a Customer class that stores:
- the name of the customer (e.g., "Alice")
- an integer value creditScore

Your Task:
Create a Customer class with the necessary attributes and constructor.

In the main method:
Create an array of Customer objects.
Define a Predicate<Customer> that checks if the credit score is greater than 700.
Use a loop, not a stream, and apply .test() to evaluate each customer.
Print only those customers who pass the test.

Class and Method Structure:
Class: Customer

Attributes:
String name 
int creditScore 
Constructor:
Accepts name and creditScore as parameters and initializes the object.

Main Class: LoanEligibilityFilter
In the main(String[] args) method:
Customer[] customers = {
new Customer("Alice", 720),
new Customer("Bob", 680),
new Customer("Charlie", 710)
};

Expected Output:
Eligible for loan:
Alice
Charlie

Hint:
Use Predicate<Customer> like this:
Predicate<Customer> isEligible = customer -> customer.creditScore > 700;

Use a basic for or for-each loop:
for (Customer c : customers) {
if (isEligible.test(c)) {
System.out.println(c.name);
}
}
Prompt the user to enter the size of array,enter the related inputs and then continue the operation.*/
import java.util.function.Predicate;
public class LoanEligibilityFilter {
    public static void main(String[] args) {
        int noOfInputs = Integer.parseInt(IO.readln().trim());
       Custom cust[] = new Custom[noOfInputs];
       Predicate<Custom> c = customers ->{
        if(customers.creditScore() > 700){
            return true;
        }
        return false;
       };

      
       for(int i = 0; i< noOfInputs; i++){
            String name = IO.readln().trim();
            int creditScore = Integer.parseInt(IO.readln().trim());
            cust[i] = new Custom(name, creditScore);
       }

       IO.println("Eligible for loan: ");

       for(Custom customer: cust){
           boolean isEligible = c.test(customer);
            if(isEligible){
                IO.println(customer.name());
            }
       }
        
    }
}

record Custom(String name, int creditScore){}