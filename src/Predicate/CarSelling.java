package Predicate;

/**Develop a scenario based program by using Functional interface to check whether a Car 
is eligible for sale or not.

Create one record called Car.
Components :
 brand : String
 price : Double
 mileage : Integer
 
 Take an ELC class CarSelling with main method. Using IO class data input, Create the 
 object for Car class.

 In the ELC class write a Predicate<T> to verify whether Car is eligible for sale or 
 not based on the following criteria.
  a) Car price should be less or equal to 5 lac.
  b) Car mileage must be greater or equal than 20.
*/

import java.util.function.Predicate;

public class CarSelling {
	public static void main(String[] args) {
		String model = IO.readln("Enter model name: ");
		double price = Double.parseDouble(IO.readln("Enter price"));
		int mileage = Integer.parseInt(IO.readln("Enter mileage"));
		Car car = new Car(model, price, mileage);
		Predicate<Car> isEligibleForSale = c -> c.price() <= 500000.0 && c.mileage() >= 20;
		
		if(isEligibleForSale.test(car)) {
			IO.println(car.brand() + " is Eligible for Sale");
		}else {
			IO.println(car.brand() + " is not Eligible for Sale");
		}
	}
	
}
