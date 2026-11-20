package PredicateFunctionInterface;
/*You are building a customer filtering module in a banking application.
Customers with a credit score above 700 are considered eligible for personal loans.

As a developer on the team, your task is to write a simple Java program that prints the names of eligible customers from a list.
You are given a Customer class that stores:
the name of the customer (e.g., "Alice")
an integer value creditScore, which indicates the customer's credit score

Your Task:
Create a Customer class with the required attributes and a constructor.

In the main method:
Create an array of Customer objects.
Use a Predicate<Customer> to define the eligibility rule.

Use a Stream to filter and display the names of eligible customers based on the rule.

Class and Method Structure:
Class: Customer

Attributes:
String name 
int creditScore 

Constructor:
Accepts name and creditScore as parameters and initializes the object.

Main Class: EligibleCustomers
In the main(String[] args) method:
Customer[] customers = {
new Customer("Alice", 720),
new Customer("Bob", 680),
new Customer("Carol", 750)
};
Expected Output:
Eligible Customers:
Alice
Carol

Hint:
Use Predicate<Customer> to check if creditScore > 700
Apply .filter(predicate) using a stream
Print only the names of eligible customers

Prompt the user to enter the size of array,enter the related inputs and then continue the operation.*/
import java.util.function.Predicate;
public class EligibleCustomers {
    public static void main(String[] args) {
        int noOfInputs = Integer.parseInt(IO.readln());
       Customers cust[] = new Customers[noOfInputs];
       Predicate<Customers> c = customers ->{
        if(customers.creditScore() > 700){
            return true;
        }
        return false;
       };

      
       for(int i = 0; i< noOfInputs; i++){
            String name = IO.readln();
            int creditScore = Integer.parseInt(IO.readln());
            cust[i] = new Customers(name, creditScore);
       }

       IO.println("Eligible Customers: ");

       for(Customers customer: cust){
           boolean isEligible = c.test(customer);
            if(isEligible){
                IO.println(customer.name());
            }
       }
        
    }
}

record Customers(String name, int creditScore){}
