package Predicate;

/*Assignment 03 :
-------------
*Develop a scenario based program by using Functional interface to check whether a customer 
is eligible for loan or not.

Create one record called Customer.
Components :
 name : String
 salary : Double
 creditScore : Integer
 age : Integer

Method :

1) Method Name     : checkLoanEligibility()
parameter          : No parameter
Return Type        : boolean
Access modifier    : public

In this method by using Predicate<Customer> verify whether a customer is eligible for
loan or not by using following criteria :

a) Customer salary should be > 25000
b) Credit Score should be > 700
c) Age must be > 21

By using Logical AND operator verify all the criteria and return true/false.


Take an ELC class LoanEligibilityWithPredicate with main method, With the help of IO
class create the input data, create the object for Customer class and verify whether the 
customer is eligible for loan or not.
*/

import java.util.function.Predicate;

record Customer(String name, Double salary, Integer creditScore, Integer age) {

	
	public boolean checkLoanEligibility() {
		Predicate<Customer> isEligible = c -> c.salary() >= 25000 && c.creditScore() > 700 && c.age() > 21;
		return isEligible.test(this);
	}
}

public class LoanEligibilityWithPredicate {
	public static void main(String[] args) {
		String name = IO.readln("Enter your Name: ");
		double salary = Double.parseDouble(IO.readln("Enter your Salary: "));
		int creditScore = Integer.parseInt(IO.readln("Enter your Credit Score: "));
		int age = Integer.parseInt(IO.readln("Enter your age: "));
		Customer cust = new Customer(name, salary, creditScore, age);
		
		if(cust.checkLoanEligibility()) {
			IO.println(cust.name()+" is Eligible for Loan.....");
		}else {
			IO.println(cust.name()+ " is not Eligible for Loan....");
		}
	}
}
