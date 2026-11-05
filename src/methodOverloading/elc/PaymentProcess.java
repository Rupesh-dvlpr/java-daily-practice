package methodOverloading.elc;

import methodOverloading.blc.Payment;

public class PaymentProcess {

	public static void main(String[] args) {
		IO.println("============PAYMENT MENU===============");
		IO.println("Please select any on Payment method from the Menu");
		IO.println("\t\t 1) Payment by using Cash ");
		IO.println("\t\t 2) Payment by using Credit Card");
		IO.println("\t\t 3) Payment by using Debit Card ");
		
		int choice = Integer.parseInt(IO.readln("Please enter your payment choice [1/ 2/ 3]: "));
		Payment payment = new Payment();
		switch(choice) {
		case 1->{
			double amount = Double.parseDouble(IO.readln("Enter the amount you want to pay through cash: "));
			payment.makePayment(amount);
		}
		
		case 2->{
			String name = IO.readln("Enter your name: ");
			String creditCardNumber = IO.readln("Enter your 16 digit Credit Card Number: ");
			double amount = Double.parseDouble(IO.readln("Enter your Payment Amount: "));
			payment.makePayment(name, creditCardNumber, amount);
		}
		
		case 3->{
			String debitCardNumber = IO.readln("Enter your 16 digit Debit Card Number : ");
			double amount = Double.parseDouble(IO.readln("Enter your Payment Amount : "));
			payment.makePayment(debitCardNumber, amount);
			
		}
		default-> IO.println("Invalid Payment Method!!! Enter valid Payment method choice [1/ 2/ 3]");
		}
	}

}
