package Inheritance;

/**
 Multiple Interface Implementation with Person
Create two interfaces:
Driver with a method drive()
Passenger with a method ride()
Implement both interfaces in a class Person.
The drive() method should print:
Person is driving
The ride() method should print:
Person is riding as a passenger
This demonstrates multiple interface implementation in Java.
Requirements
Define an interface Driver with a method drive().
Define an interface Passenger with a method ride().
Create a class Person that implements both interfaces.
In the main method, create a Person object and call both methods.
Switch-Case Explanation

The program can be menu-driven to allow the user to select actions for the Person object:
Case 1: Call drive() → prints "Person is driving"
Case 2: Call ride() → prints "Person is riding as a passenger"
Case 3: Call both drive() and ride() → prints:
*/



import java.util.*;

public class MultipleInheritanceExample3 {
    public static void main(String[] args) {
        int choice = Integer.parseInt(IO.readln("Enter your choice: "));
        Person person = new Person();
        switch(choice){
            case 1-> person.drive();
            case 2-> person.ride();
            case 3->{
                person.drive();
                person.ride();
            }
        }
        
    }
}


interface Driver{
    void drive();
}

interface Passenger{
    void ride();
}

class Person implements Driver,Passenger{
    @Override
    public void drive(){
        IO.println("Person is driving");
    }

    @Override
    public void ride(){
        IO.println("Person is riding as a passenger");
    }
}
