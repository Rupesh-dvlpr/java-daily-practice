package Multithreading;
/*Develop a multithreading-based Java program to simulate an OLA cab booking process.

Create 6 BLC classes (extend Thread or use Anonymous Inner Class):

RideRequest
DriverAssignment
FareCalculation
LiveTracking
PaymentProcessing
RatingSystem

Requirements (override run() in all classes):
=============================
RideRequest:
Print "User requested a ride...", wait 2 sec → print "Searching for nearby drivers..."

DriverAssignment:
Wait 3 sec → print "Driver found and assigned!"

FareCalculation:
Print "Calculating estimated fare...", wait 1.5 sec → print "Estimated fare: 135.75 RS."

LiveTracking:
Print ride progress in % (20% to 100%) → then "Ride completed!"

PaymentProcessing:
Print "Processing payment...", wait 2 sec → print "Payment successful!"

RatingSystem:
Print "Requesting user rating...", wait 1 sec → print "User rated the ride: 5 star"

Main Class: OlaRidingApp
=================
Create objects for all 6 classes Or Anonymous inner class approach :
Start RideRequest and FareCalculation together
Use join() on RideRequest
Use proper start() and join() sequence to match expected output*/

public class OlaRideBooking extends Thread{
    public static void main(String[] args) throws InterruptedException{
        RideRequest rr = new RideRequest();
        
        DriverAssignment da = new DriverAssignment();
        
        FareCalculation fc = new FareCalculation();
        
        LiveTracking lt = new LiveTracking();
        
        PaymentProcessing pp = new PaymentProcessing();
        
        RatingSystem rs = new RatingSystem();
       
        rr.start();
        fc.start();
        rr.join();
        da.start();
        da.join();
        lt.start();
        lt.join();
        pp.start();
        pp.join();
        rs.start();
        
    }
}


class RideRequest extends Thread{
    @Override
   public void run(){
                 System.out.println("User requested a ride...");
                try{
                sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("    Searching for nearby drivers...");
            
   }
}

class DriverAssignment extends Thread{
    @Override
   public void run(){
        try{
                sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        System.out.println("    Driver found and assigned!");
   }
}

class FareCalculation extends Thread{
    @Override
   public void run(){
        System.out.println("    Calculating estimated fare...");
        try{
                sleep(1500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        System.out.println("    Estimated fare: 135.75 RS.");
   }
}

class LiveTracking extends Thread{
    @Override
   public void run(){
        for(int i=20; i<=100; i+=20){
        	try{
                sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("    Updating ride location... "+i+"% completed");    
            }
            System.out.println("    Ride completed!");
        }
   }


class PaymentProcessing extends Thread{
   @Override
   public void run(){
    System.out.println("    Processing payment...");
    try{
        sleep(2000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
    System.out.println("    Payment successful!");
   }
}

class RatingSystem extends Thread{
   @Override
   public void run(){
    System.out.println("    Requesting user rating...");
    try{
        sleep(1000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
    System.out.println("    User rated the ride: 5 star");
   }
}
