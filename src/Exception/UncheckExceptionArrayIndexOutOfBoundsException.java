package Exception;
/**You are developing a Java program that works with a fixed-size integer array.
The program allows the user to access an element of the array using a given index.

If the user enters an index that is less than 0 or greater than or equal to the array length, the program should handle this situation gracefully by catching an ArrayIndexOutOfBoundsException and displaying an appropriate message.
For valid indices, the program should display the value stored at that index.

This program demonstrates how Java handles runtime exceptions related to invalid array access and how to manage them using try-catch blocks
Index must be within 0 to array length - 1
• Array size is fixed
int[] arr = {1, 2, 3};
Use a predefined integer array
• Read index value from user input
• Access array element using the index
• Handle ArrayIndexOutOfBoundsException
• Display either the value or exception message*/
public class UncheckExceptionArrayIndexOutOfBoundsException {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3};
	        int index = Integer.parseInt(IO.readln());
	        try{
	            if(index<0 && index > (arr.length-1)){
	                throw new ArrayIndexOutOfBoundsException();
	            }
	            IO.println("Value: "+arr[index]);
	        }catch(ArrayIndexOutOfBoundsException e){
	                IO.println("ArrayIndexOutOfBoundsException: "+ e.getMessage());
	            }
	        
	    }
}
