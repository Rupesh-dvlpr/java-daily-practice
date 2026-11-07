package Exception;

/**
 A school stores a student's total marks and wants to calculate
the average marks per subject.

The user will input:

Total Marks

Number of Subjects

But if the user enters 0 subjects,
the program should not crash — instead show a meaningful message.
Program Requirements

Create a class:

Class Name : StudentMarks
Method Name : calculateAverage()

Inside calculateAverage() method

Use:

try -> perform division totalMarks / subjectCount

catch -> handle divide-by-zero
 */


import java.util.*;

public class TryCatchExample1 {
    public static void main(String[] args) {
        int totalMarks = Integer.parseInt(IO.readln("Enter your totalMarks: "));
        int subjectCount = Integer.parseInt(IO.readln("Number of total subjects: "));

        StudentMarks marks = new StudentMarks();
        marks.calculateAverage(totalMarks, subjectCount);
        IO.println("Calculation Completed.");
        
    }
}

class StudentMarks{
    public void calculateAverage(int totalMarks, int subjectCount){
        try{
            IO.println("Average Marks: "+ (totalMarks/subjectCount));
        }catch(ArithmeticException e){
            IO.println("Cannot divide by zero");
        }
    }
}
