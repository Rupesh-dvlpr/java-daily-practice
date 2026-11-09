package Exception;

/*You are developing a simple calculator program that performs integer division.
The program should accept two integers from the user: a numerator and a denominator, and then perform division of the numerator by the denominator.
If the user enters 0 as the denominator, the program must handle this situation gracefully by throwing and catching an ArithmeticException.
For valid inputs, the program should display the result of the division.
This program demonstrates how Java handles runtime exceptions and how to use try-catch blocks to manage divide-by-zero errors safely.
Read numerator and denominator from user input
• Perform integer division
• Handle ArithmeticException when denominator is zero
• Display appropriate result or exception message
**/


public class UncheckedException1 {
    public static void main(String[] args) {
        int x = Integer.parseInt(IO.readln());
        int y = Integer.parseInt(IO.readln());

        try{
            int result = x/y;
            IO.println("Result: "+x+" / "+y+" = "+result);
        }catch(ArithmeticException e){
            IO.println("ArithmeticException: / by zero");
        }
        
    }
}
