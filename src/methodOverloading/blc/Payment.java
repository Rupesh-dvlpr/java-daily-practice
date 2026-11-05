package methodOverloading.blc;

public class Payment {
	public void makePayment(double amount) {
	 if(validateAmount(amount)) {
		 IO.println("Processing payment via Cash...");
		 IO.println("Amount Paid RS : "+amount);
		 IO.println("Payment Successful!");
	 }else {
		 IO.println("Error: Amount must be greater than zero.");
	 }
	}
	
	public void makePayment(String cardHolderName, String creditCardNumber, double amount) {
		
		if(validateCardNumber(creditCardNumber) && validateAmount(amount)) {
			IO.println("Processing payment via Credit Card...");
			IO.println("Card Holder: "+cardHolderName);
			IO.println("Card Number: "+maskCardNumber(creditCardNumber));
			IO.println("Amount Paid RS : "+amount);
			 IO.println("Payment Successful!");		
		}else{
			if(!validateCardNumber(creditCardNumber)) {
				 IO.println("Error: Invalid Card Number. I must be of 16 digits.");
			}else {
				IO.println("Error: Amount must be greater than zero.");
			}
			
		}
		
	}
	
	public void makePayment(String debitCardNumber, double amount) {
		if(validateCardNumber(debitCardNumber) && validateAmount(amount)) {
			IO.println("Processing payment via Debit Card...");
			IO.println("Card Number: "+maskCardNumber(debitCardNumber));
			IO.println("Amount Paid RS : "+amount);
			 IO.println("Payment Successful!");		
		}else{
			if(!validateCardNumber(debitCardNumber)) {
				 IO.println("Error: Invalid Card Number. I must be of 16 digits.");
			}else {
				IO.println("Error: Amount must be greater than zero.");
			}
			
		}
	}
	
	private boolean validateAmount(double amount) {
		if(amount>0) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean validateCardNumber(String cardNumber) {
		if(cardNumber.length()==16) {		
			return true;
		}else {
			return false;
		}
	}
	
	private String maskCardNumber(String cardNumber) {
		String hidden = "****-****-****-";
		for(int i = 12; i <= 15; i++) {
			hidden += cardNumber.charAt(i);
		}
		return hidden;
	}
}

