package CustomException;
/*ou are required to simulate a Hospital Bed Allocation System using a custom exception in Java.
The system checks whether beds are available in the hospital before allocating one to a patient.

1. Class Design
Create a custom exception class named BedUnavailableException.
Create a main class to manage user input and bed allocation logic.
2. Instance Variable
int bedCount
→ Represents the number of available beds in the hospital.
3. Method Responsibility
Read the number of available beds from the user.
If the bed count is 0, throw a custom exception.
If beds are available, allocate a bed successfully.
4. Exception Handling Logic
If bedCount == 0, explicitly throw BedUnavailableException.
Catch the custom exception and print an appropriate message.
This problem demonstrates how custom exceptions improve clarity when handling domain-specific errors.
Input Format
--------------------
A single integer representing the number of available beds.
Output Format
-----------------------
If beds are available:
Bed allocated successfully**/
import java.util.*;

public class CustomExceptionHospitalResource {
    public static void main(String[] args) {
       int bedCount;
       Scanner sc = new Scanner(System.in);
        try(sc){
            bedCount = sc.nextInt();
            if(bedCount == 0){
                throw new BedUnavailableException("No beds available");                
            }else{
                IO.println("Bed allocated successfully");
            }
        }catch(BedUnavailableException e){
            IO.println(e.getMessage());
        }finally{
            sc.close();
        }
        
    }
}


class BedUnavailableException extends Exception{
    BedUnavailableException(){

    }

    BedUnavailableException(String message){
        super(message);
    }
}
