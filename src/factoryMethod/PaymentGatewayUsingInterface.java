package factoryMethod;

interface Payments{
	public abstract void processPayment();
	public abstract void applyDiscount();
}

class CreditCardPayment implements Payments{
	@Override
	public void processPayment(){
		IO.println("Processing Credit Card Payment...");
	}
	
	@Override
	public void applyDiscount() {
		IO.println("Applying 10% discount for Credit Card Payment");
	}
}

class UPIPayment implements Payments{
	@Override
	public void processPayment(){
		IO.println("Processing UPI Payment...");
	}
	
	@Override
	public void applyDiscount() {
		IO.println("Applying 5% discount for UPI Payment");
	}
}

class PaymentGateway{
	public static Payments initiatePayment(String paymentType) {
		if(paymentType.equalsIgnoreCase("UPI")) {
			IO.println("Initiating UPI Payment");
			return new UPIPayment();
		}
		else if(paymentType.equalsIgnoreCase("CreditCard")) {
			IO.println("Initiating Credit Card Payment");
			return new CreditCardPayment();
		}else {
			IO.println("Invalid Payment type selected!");
			return null;
		}
	}
}
public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
		
		IO.println("==============Payment Gateway================");
		String type = IO.readln("Enter Payment Type [CreditCard / UPI]: ");		
		Payments paymentGateway=PaymentGateway.initiatePayment(type);
		paymentGateway.processPayment();
		paymentGateway.applyDiscount();
	}

}


