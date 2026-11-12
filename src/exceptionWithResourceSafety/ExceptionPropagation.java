package exceptionWithResourceSafety;
/*You are required to simulate a Laptop Service Center Warranty Check System to understand exception propagation in Java.
The program consists of multiple methods, where an exception is thrown in a lower-level method and propagated to the calling method without being handled immediately.

Class Design
Create a class named LaptopService.
The main method starts the service request.
Methods
checkWarranty(int warrantyYears)
Throws ArithmeticException if warranty years are 0.
processService(int warrantyYears)
Calls checkWarranty() but does not handle the exception.
main()
Calls processService() and handles the exception.
This demonstrates exception propagation across methods.
Input Format
--------------------
A single integer representing warranty years.
Output Format
----------------------
If warranty is valid:
Laptop service approved
If warranty is invalid:
Warranty expired*/

import java.util.*;

public class ExceptionPropagation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try(sc){
        int warrantyYears = sc.nextInt();
        LaptopService service = new LaptopService();
        service.processService(warrantyYears);
       }catch(ArithmeticException e){
        System.out.println(e.getMessage());
       }
        
    }
}

class LaptopService{
    public void checkWarranty(int warrantyYears){
        if(warrantyYears<=0){
            throw new ArithmeticException("Warranty expired");
        }
        System.out.println("Laptop service approved");
    }

   public void processService(int warrantyYears) throws ArithmeticException {
        checkWarranty(warrantyYears);
    }
}
