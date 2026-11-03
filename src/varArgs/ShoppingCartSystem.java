package varArgs;

public class ShoppingCartSystem {

	public static void main(String[] args) {
		IO.println("------SHOPPING CART SYSTEM-----------");
		String customerName = IO.readln("Enter Customer Number: ");
		
		ShoppingCartSystem shoppingCartSystem = new ShoppingCartSystem();
		shoppingCartSystem.processPayment(customerName,100,200,300,400,500,600,200);
	}
	
	public void processPayment(String customerName, double ...prices) {
		int total = 0;
		for(double price : prices) {
			total += price;
		}
		IO.println(customerName + " total bill : "+total);
	}

}
