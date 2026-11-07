package Inheritance;

/**
Q1. Create a Java program demonstrating Inheritance,Method overriding,Interface implementation,Polymorphism

Class Structure 
Type Name Behavior
Base Class Vehicle showType() -> prints "Generic Vehicle"
Subclass Car extends Vehicle overrides -> "Vehicle Type: Car"
Subclass Truck extends Vehicle implements ElectricVehicle 
Interface ElectricVehicle showHybridFeature() -> "Hybrid Feature: Electric Assist Enabled"

Your Task
Accept a number choice from user.

Based on the choice:
1 -> Car -> call showType()
2 -> Truck -> call showType() and showHybridFeature()
If choice = 3, create:
Vehicle[] vehicles = { new Car(), new Truck() };

Loop through the array and call showType() for each.
Then call showHybridFeature() only on Truck.
Use a switch-case to handle choices.*/



import java.util.*;

public class InterfaceOverridingPolymorphism {
    public static void main(String[] args) {
        int choice = Integer.parseInt(IO.readln("Enter your choice: "));

        switch(choice){
            case 1->{
                Vehicle vehicle = new Car();
                IO.print("Car Type: ");
                vehicle.showType();
            }

            case 2->{
                Vehicle vehicle = new Truck();
                IO.println("Truck Type:");
                vehicle.showType();
                Truck truck = new Truck();
                truck.showHybridFeature();
            }

            case 3->{
                Vehicle[] vehicles = {new Car(),new Truck()};
                for(Vehicle vehicle : vehicles)
                vehicle.showType();
                Truck truck = new Truck();
                truck.showHybridFeature();
            }
        }
        
    }
}

class Vehicle{
    public void showType(){
        IO.println("Generic Vehicle");
    }
}

class Car extends Vehicle{
    @Override
    public void showType(){
        IO.println("Vehicle Type: Car");
    }
}

class Truck extends Vehicle implements ElectricVehicle{
    @Override
    public void showType(){
        IO.println("Vehicle Type: Truck");
    }
}

interface ElectricVehicle{
    default void showHybridFeature(){
        IO.println("Hybrid Feature: Electric Assist Enabled");
    }
}
