package interfaces;

/**
 Create a base class Person with a method:
showInfo() -> prints "General Person Information"

Create a subclass Teacher that extends Person and overrides:
showInfo() -> prints "Teacher Information"

Create another subclass HeadTeacher that extends Teacher and implements the interface Leader.
Create an interface Leader with method:
lead() -> prints "HeadTeacher Leading the School"


You must demonstrate the behavior by creating objects and calling appropriate methods.
Input

1 -> Create Teacher object and call showInfo()
2 -> Create HeadTeacher object and call showInfo() and lead()
3 -> Create array:

Person[] p = { new Teacher(), new HeadTeacher() }

Call showInfo() on each
Then call lead() on HeadTeacher
*/


import java.util.*;

public class InterfaceOverriding {
    public static void main(String[] args) {
        int choice = Integer.parseInt(IO.readln("Enter your choice: "));
        switch(choice){
            case 1->{
                Person person = new Teacher();
                IO.print("Teacher Info: ");
                person.showInfO();
            }

            case 2->{
                Person person = new HeadTeacher();
                IO.print("HeadTeacher Info: ");
                person.showInfO();
                HeadTeacher headTeacher = new HeadTeacher();
                IO.print("HeadTeacher Leading: ");
                headTeacher.lead();
            }

            case 3->{
                Person[] persons = {new Teacher(), new HeadTeacher()};
                for(Person person : persons)
                person.showInfO();
                HeadTeacher headTeacher = new HeadTeacher();
                headTeacher.lead();
            }
        }
        
    }
}

class Person{
    public void showInfO(){
        IO.println("General Person Information");
    }
}

class Teacher extends Person{
    @Override
    public void showInfO(){
        IO.println("Teacher Information");
    }
}

class HeadTeacher extends Teacher implements Leader{
     @Override
    public void showInfO(){
        IO.println("Teacher Information");
    }
}

interface Leader{
    default void lead(){
        IO.println("HeadTeacher Leading the School");
    }
}

