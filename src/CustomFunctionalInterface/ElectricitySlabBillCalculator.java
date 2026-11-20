package CustomFunctionalInterface;
/*An electricity department calculates the monthly bill based on the number of units consumed.
To ensure that the billing logic is defined using exactly one abstract method, 
the interface must be annotated with @FunctionalInterface.

The slab calculation logic should be implemented using a lambda expression.

Rules
Create an interface ElectricityBillCalculator
Annotate it with @FunctionalInterface
Declare only one abstract method:
double calculateBill(int units);

Billing Logic:
Units ≤ 100 → ₹2 per unit
Units > 100 and ≤ 300
First 100 → ₹2/unit
Remaining → ₹3/unit
Units > 300
First 100 → ₹2/unit
Next 200 → ₹3/unit
Remaining → ₹5/unit
Implement the interface using a lambda expression
Display the total bill amount

Input Format
---------------------
Units Consumed
Output Format
-----------------------
Display the total electricity bill amount*/
public class ElectricitySlabBillCalculator {
	public static void main(String[] args) {
	       int unit = Integer.parseInt(IO.readln());
	       ElectricityBillCalculator<Integer, Double> ebc = u ->{
	        if(u <= 100){
	            return u*2.0;
	        }else if(u > 100 && u <= 300){
	            return ((100 * 2.0)+((u-100)*3.0));
	        }else{
	            return ((100 * 2.0) + (200 * 3.0) + ((u-300)*5.0));
	        }
	       };

	       IO.println("Total Bill = "+ebc.calculateBill(unit));
	        
	    }
	}

	@FunctionalInterface
	interface ElectricityBillCalculator<T,R>{
	    R calculateBill(T units);
	}

