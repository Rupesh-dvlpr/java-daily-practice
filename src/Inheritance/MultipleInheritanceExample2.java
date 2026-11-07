package Inheritance;


/**
Problem: Multiple Interface Implementation with Book

Create two interfaces:
Readable with a method read()
Writable with a method write()

Implement both interfaces in a class Book.
The read() method should print "Reading the book".
The write() method should print "Writing in the book".
This problem demonstrates how a single class can implement multiple interfaces in Java.

Requirements
Define two interfaces Readable and Writable.
Each interface should declare one method (read() and write()).

Create a class Book that implements both interfaces.
In the main method, create a Book object and call both methods.
Switch-Case Explanation

The program can be modified to allow the user to select which action to perform on the Book object using a menu:
Case 1: Create a Book object and call read() → prints "Reading the book"
Case 2: Create a Book object and call write() → prints "Writing in the book"
Case 3: Both(read and write)
Default case: Handle any invalid input → prints "Invalid choice"
*/


import java.util.*;

public class MultipleInheritanceExample2 {
    public static void main(String[] args) {
       int choice = Integer.parseInt(IO.readln("Enter your choice: "));
        Book book = new Book();
       switch(choice){
        case 1->{
            book.read();
        }

        case 2->{
            book.write();
        }

        case 3->{
            book.read();
            book.write();
        }
       }
        
    }
}

interface Readable{
    void read();
}

interface Writable{
    void write();
}

class Book implements Readable,Writable{
    public void read(){
        IO.println("Reading the book");
    }

    public void write(){
        IO.println("Writing in the book");
    }
}
