package exceptionWithResourceSafety;

/*Write a program to search for an element in an array.
First, take the size of the array.
Then, input the elements of the array.
Finally, input the index to search.
If the index is invalid, catch ArrayIndexOutOfBoundsException.
If the input type is invalid, catch InputMismatchException.

Input Format
--------------------
Integer n -> size of the array.
n integers -> array elements.
Integer index -> position to search.

Output Format
------------------------
If index is valid:
Element at index <index>: <value>
If index is invalid:
Index out of range
If input type is invalid:
Invalid input type*/

import java.util.*;

public class ArrayIndexOutOfBoundsWithArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(sc){
            int arraySize = sc.nextInt();
            int arr[] = new int[arraySize];
            for(int i=0; i<arr.length;i++){
                int value = sc.nextInt();
                arr[i] = value;
            }
            int index = sc.nextInt();
            if(index>=arr.length){
                throw new ArrayIndexOutOfBoundsException("Index out of range");
            }
            System.out.println("Element at index "+index+": "+arr[index]);
        }catch(InputMismatchException e){
            System.out.println("Invalid input type");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
