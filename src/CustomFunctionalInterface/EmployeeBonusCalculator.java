package CustomFunctionalInterface;
/*A company wants to calculate an employee’s bonus amount based on their salary and performance rating.
To ensure the calculation logic is defined using exactly one abstract method, the interface must be annotated with @FunctionalInterface.

The bonus calculation logic should be implemented using a lambda expression.

Rules
Create an interface BonusCalculator
Annotate it with @FunctionalInterface
Declare only one abstract method:
double calculateBonus(double salary, int rating);

Bonus Calculation Logic:
Rating ≥ 4 → 20% of salary
Rating = 3 → 10% of salary
Rating < 3 → No bonus
Implement the interface using a lambda expression
Display the calculated bonus amount

Input Format
Salary
Performance Rating

Output Format
Display the bonus amount*/
import java.util.*;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        double salary = Double.parseDouble(IO.readln());
        int rating = Integer.parseInt(IO.readln());

        BonusCalculator<Double, Integer, Double> bc = (sal, rat) ->{
            if(rating>=4){
                return (sal * 0.2);
            }else if(rating == 3){
                return (sal * 0.1);
            }else{
                return 0.0;
            }
        };

        IO.println("Bonus Amount = "+bc.calculateBonus(salary, rating));
        
    }
}

@FunctionalInterface
interface BonusCalculator<T,U,R>{
    Double calculateBonus(Double salary, Integer rating);
}

