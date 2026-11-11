package CustomException;
/*You are developing a Java-based academic management system that allows students to register for courses.
Each course has a fixed capacity and a current count of already enrolled students.

If the number of enrolled students is equal to the course capacity, the program must throw a custom exception named CourseFullException.
If seats are available, registration should proceed successfully and the remaining seats should be displayed.

Input Format
---------------------
First line: Course Capacity
Second line: Already Enrolled Students

Output Format
-------------------
If course is full:
CourseFullException: Course registration full
If seats are available:
Registration successful. Seats left: <count>*/
import java.util.*;

public class CustomExceptionCourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int courseCapacity;
        int alreadyEnrolled;

        try(sc){
            courseCapacity = sc.nextInt();
            alreadyEnrolled = sc.nextInt();
            if(courseCapacity <= alreadyEnrolled){
                throw new CourseFullException("Course registration full");
            }
            System.out.println("Registration successful. Seats left: "+(courseCapacity-alreadyEnrolled));
        }catch(CourseFullException e){
            System.out.println(e);
        }finally {
        	sc.close();
        }
        
    }
}


class CourseFullException extends Exception{
    CourseFullException(){

    }
    CourseFullException(String msg){
        super(msg);
    }
}