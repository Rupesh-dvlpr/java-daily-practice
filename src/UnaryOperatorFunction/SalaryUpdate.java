package UnaryOperatorFunction;
/*A company increments employee salary using UnaryOperator. The same data type must be used for input and output. 
Input Format: Salary. 
Output Format: Updated Salary after increment.*/
import java.util.*;
import java.util.function.UnaryOperator;
public class SalaryUpdate {
    public static void main(String[] args) {
        double amount = Double.parseDouble(IO.readln());

        UnaryOperator<Double> sal = amt -> (amt + (amt * 0.1));
        IO.println("Updated Salary: "+ sal.apply(amount));
        
    }
}

