package factoryMethod;

//Another program on Factory Design Pattern



interface SIM {
 void makeCall();
 void videoCall();
}

class BSNL implements SIM {

 @Override
 public void makeCall() {
     IO.println("Making a voice call through BSNL SIM");
 }

 @Override
 public void videoCall() {
     IO.println("Making a Video call through BSNL SIM");
 }
}

class JIO implements SIM {

 @Override
 public void makeCall() {
     IO.println("Making a voice call through Jio SIM");
 }

 @Override
 public void videoCall() {
     IO.println("Making a Video call through Jio SIM");
 }
}

class Airtel implements SIM {

 @Override
 public void makeCall() {
     IO.println("Making a voice call through Airtel SIM");
 }

 @Override
 public void videoCall() {
     IO.println("Making a Video call through Airtel SIM");
 }
}

class SIMFactory {

 public static SIM getSIMObject(String simType) {

     if (simType.equalsIgnoreCase("BSNL")) {
         return new BSNL();
     }
     else if (simType.equalsIgnoreCase("JIO")) {
         return new JIO();
     }
     else {
         return new Airtel();
     }
 }
}

public class FactoryDesignPattern2 {

 public static void main(String[] args) {

     String type = IO.readln("Select a SIM [BSNL OR JIO OR AIRTEL] : ");

     SIM sim = SIMFactory.getSIMObject(type);

     sim.makeCall();
     sim.videoCall();
 }
}