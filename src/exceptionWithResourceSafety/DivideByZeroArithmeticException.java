package exceptionWithResourceSafety;
/*Create a program to divide two numbers.
If the divisor is zero, an exception occurs and must be declared using throws.

Create a class Calculator with:
divide(int a, int b) throws ArithmeticException

Input Format
-------------------
Two integers (dividend and divisor)

Output Format
----------------------
Result or exception message*/
import java.util.*;

public class DivideByZeroArithmeticException {
    public static void main(String[] args) {
        System.out.println("Enter two number to perform division: ");
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        try(sc){
            a = sc.nextInt();
            b = sc.nextInt();
            Calculator cal = new Calculator();
            cal.divide(a,b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
    }
}

class Calculator {
    public void divide(int a, int b) throws ArithmeticException{
       IO.println("Result: "+(a/b));
    }
}
