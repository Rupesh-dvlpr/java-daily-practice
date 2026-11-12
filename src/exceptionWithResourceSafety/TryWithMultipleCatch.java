package exceptionWithResourceSafety;
/*Write a program to divide two integers. 
- If the denominator is zero, catch ArithmeticException. 
- If the input is not an integer, catch InputMismatchException. 
- Otherwise, print the result. 
Input Format
-------------------- 
- Two integers (numerator and denominator). 
Output Format
------------------------ 
- Division result if valid. 
- Error message if exception occurs.*/
import java.util.*;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        try(sc){
             a = sc.nextInt();
             b = sc.nextInt();
            if(b==0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            System.out.println("Result: "+(a/b));
        }catch(InputMismatchException e){
            System.out.println("Invalid input type");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
    }
}
