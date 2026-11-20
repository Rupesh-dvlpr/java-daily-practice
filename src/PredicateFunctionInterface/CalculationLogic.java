package PredicateFunctionInterface;
/*
 * Assignment 01 :
---------------
*Write a Java program that defines a method testPredicate to test a given number against a provided predicate.
class name CalculationLogic(ELC) :

Method name : testPredicate
Access Modifier : public
Non-Access Modifier : static
return type : boolean
parameters : int, Predicate<Integer>
This method should return a boolean value indicating whether the given number satisfies the provided predicate.


In the main method:
Define three predicates:
isEven: Checks if a given number is even.
isGreaterThanTen: Checks if a given number is greater than 10.
isPrime: Verify the given number is prime or not.

Define a sample integer number (e.g., 18).
Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.

 * */
import java.util.function.Predicate;

public class CalculationLogic {
	public static boolean testPredicate(int number, Predicate<Integer> predicate ) {
		return predicate.test(number);
	}
	
	public static void main(String[] args) {
		Predicate<Integer> isEven = num -> num % 2 == 0;
		Predicate<Integer> isGreaterThanTen = num -> num > 10;
		Predicate<Integer> isPrime = num ->{
			if(num<=1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
		};
		
		int sampleNumber = Integer.parseInt(IO.readln());
		
        System.out.println("Is even? " + testPredicate(sampleNumber, isEven));
        System.out.println("Is greater than 10? " + testPredicate(sampleNumber, isGreaterThanTen));
        System.out.println("Is prime? " + testPredicate(sampleNumber, isPrime));
	}
}
