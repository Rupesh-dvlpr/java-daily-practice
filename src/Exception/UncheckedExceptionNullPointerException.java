package Exception;
/*You are developing a Java program that works with String objects.
The program accepts a string input from the user and attempts to perform an operation on it, such as finding its length.

If the string reference is null, calling any method on it (for example, length()) should result in a NullPointerException.
The program must demonstrate this behavior and handle or identify the exception properly.
If the string is valid (not null), the program should display the length of the string.
This program demonstrates how Java handles NullPointerException when methods are invoked on null references and how to manage such cases using try-catch blocks.
Read a string value from user input
• Convert input "null" into a null reference
• Call length() on the string
• Handle NullPointerException if the string is null
• Display string length for valid input**/


public class UncheckedExceptionNullPointerException {
	 public static void main(String[] args) {
		 	System.out.println("Enter your name: ");
	        String input = IO.readln();
	        if(input.equalsIgnoreCase("null")){
	            input = null;
	        }
	        try{
	            if(input.length()>0){
	            IO.println("Length: "+input.length());
	            }else{
	            throw new NullPointerException();
	            }
	        }catch(NullPointerException e){
	            IO.println(e);
	        }
	        
	    }
}
