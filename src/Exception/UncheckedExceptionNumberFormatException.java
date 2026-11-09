package Exception;
/*You are developing a Java program that converts a string input into an integer value.
The program reads a string from the user and attempts to convert it using Integer.parseInt().

If the input string does not represent a valid integer (for example, it contains alphabetic or special characters), Java throws a NumberFormatException.
The program should demonstrate this behavior by handling the exception and displaying an appropriate message.
If the input string is a valid number, the program should convert it successfully and display the converted integer.
This program demonstrates how Java handles NumberFormatException during string-to-integer conversion and how to manage it using try-catch blocks.
Read a string from user input
• Attempt to convert the string to an integer
• Handle NumberFormatException for invalid input
• Display converted number for valid input**/


public class UncheckedExceptionNumberFormatException {
	public static void main(String[] args) {
	       String value = IO.readln();
	        try{
	            int number = Integer.parseInt(value);
	            IO.println("Converted Number: "+number);     
	            
	        }catch(NumberFormatException e){
	            IO.println("NumberFormatException "+e.getMessage());
	        }
	    }
}
