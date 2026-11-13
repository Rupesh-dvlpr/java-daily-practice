package CustomException;

import java.util.Scanner;

class CarStoppedException extends Exception{
	CarStoppedException(String msg){
		super(msg);
	}
}

class CarPunctureException extends Exception{
	CarPunctureException(String msg){
		super(msg);
	}
}

class CarHeatException extends Exception{
	CarHeatException(String msg){
		super(msg);
	}
}

class CarTest{
	public static void stop(String msg) throws CarStoppedException {
		if(msg.equalsIgnoreCase("Stop")) {
			throw new CarStoppedException("Car is stopped for some reason.");
		}else {
			System.out.println("Car not stopped");
		}
	}
	
	public static void punture(String msg) throws CarPunctureException{
		if(msg.equalsIgnoreCase("puncture")) {
			throw new CarPunctureException("Car is punctured");
		}else {
			System.out.println("Car not punctured.");
		}
	}
	
	public static void carHeat(int temprature) throws CarHeatException {
		if(temprature > 50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		}else {
			System.out.println("Car temperature normal.");
		}
	}
}


public class CarTestCustomExceptionsExample {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc) {
			System.out.print("Enter Car is temperature [in degree celsius]: ");
			int temperature = sc.nextInt();
			sc.nextLine();
			CarTest.carHeat(temperature);
			System.out.print("Enter Car is puncture or not puncture[puncture / running]: ");
			String wheel = sc.nextLine();
			CarTest.punture(wheel);
			System.out.print("Enter Car is in move state or stop [move / stop]: ");
			String movement = sc.nextLine();
			CarTest.stop(movement);
		}catch(CarStoppedException e){	
			System.out.println(e.getMessage());
		}catch(CarPunctureException e) {
			System.out.println(e.getMessage());
		}catch(CarHeatException e) {
			System.out.println(e.getMessage());
		}

	}

}
