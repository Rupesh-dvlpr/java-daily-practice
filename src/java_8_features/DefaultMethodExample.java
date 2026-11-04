package java_8_features;

interface Vehicle {

 void run();
 void horn();

 default void digitalMeter() {  // JDK 1.8V [Backward Compatibility]
     IO.println("Default Implementation");
 }
}

class Car implements Vehicle {

    @Override
    public void run() {
        IO.println("Car is running");
    }

    @Override
    public void horn() {
        IO.println("Car has horn");
    }

    @Override
    public void digitalMeter() {  // Default method is overridden
        IO.println("Car has digital Meter");
    }
}

class Bike implements Vehicle {

    @Override
    public void run() {
        IO.println("Bike is running");
    }

    @Override
    public void horn() {
        IO.println("Bike has horn");
    }
}

public class DefaultMethodExample {

    public static void main(String[] args) {

        Vehicle v = null;

        v = new Car();
        v.run();
        v.horn();
        v.digitalMeter();

        v = new Bike();
        v.run();
        v.horn();
    }
}
