package objectMethods;

/**You are developing a Student Identity Verification System.

Two student objects should be considered equal if they have the same student ID, even if other details differ.
To achieve this, you must override the equals() and hashCode() methods of the Object class.
in the hashcode() return any of class property which is having integer datatype 

Class Details

Create a class named Student.

Data Members
int studentId // unique student identifier
String name // student full name
String course // enrolled course

Constructor
Student(int studentId, String name, String course)
Initializes all fields.

Override equals(Object obj)

Logic
If both objects have the same studentId, return true.
Otherwise, return false.

Main Class Details

Create a class named StudentApp.

Use Scanner to read details of two students:
Student ID
Name
Course

Create two Student objects.
Compare them using equals().

If equal → print
Students are equal

Else → print
Students are not equal

*/

import java.util.*;

public class EqualsMethod {
    public static void main(String[] args) {
       int studentId = Integer.parseInt(IO.readln("Enter student ID: "));
       String studentName = IO.readln("Enter Student name: ");
       String studentCourse = IO.readln("Enter student course: ");
        Student s1 = new Student(studentId, studentName,studentCourse);
        int studentId2 = Integer.parseInt(IO.readln("Enter student ID: "));
       String studentName2 = IO.readln("Enter Student name: ");
       String studentCourse2 = IO.readln("Enter student course: ");
        Student s2 = new Student(studentId2, studentName2,studentCourse2);

        if(s1.equals(s2)){
            IO.println("Students are equal");
        }else{
            IO.println("Students are not equal");
        }
    }
}

class Student{
    int studentId;
    String name;
    String course;
    Student(int studentId, String name, String course){
        super();
        if(studentId<0){
            IO.println("Error: Student ID must be greater than zero");
            System.exit(0);
        }
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    @Override
    public int hashCode(){
        return this.studentId;
    }

    @Override
    public boolean equals(Object obj){
        //Retrieving first object data
        int id = this.studentId;

        //Retrieving second object data
        Student s2 = (Student) obj;
        int id2 = s2.studentId;

        if(studentId == id2){
            return true;
        }else{
            return false;
        }
    }
}
