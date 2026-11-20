package CustomFunctionalInterface;
/*An HR system calculates employee bonus using a custom functional interface.
 * Bonus logic should not be hardcoded inside main. 
 * Rules: Create interface BonusCalculator with method double calculate(double salary). 
 * Bonus = 15% of salary if salary ≥ 50000, else 5%. Input Format: Salary. 
 * Output Format: Bonus amount.*/
public class SalaryBonusCalculator {
	 public static void main(String[] args) {
	        double sal = Double.parseDouble(IO.readln());

	        BonusCalculatorc<Double, Double> bc = salary ->{
	            if(salary >= 50000){
	                return (salary * 0.15);
	            }else{
	                return (salary * 0.05);
	            }
	        };

	        IO.println("Bonus = "+bc.calculate(sal));
	        
	    }
	}

	@FunctionalInterface
	interface BonusCalculatorc<T, R>{
	    R calculate(T salary);
	}
