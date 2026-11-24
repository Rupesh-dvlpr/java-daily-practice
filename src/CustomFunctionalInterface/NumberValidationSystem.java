package CustomFunctionalInterface;
/*A data validation module checks whether a given number is positive, negative, or zero.
 * The rule must be encapsulated inside a custom functional interface. 
 * Rules: Create interface NumberValidator with method String validate(int number).
 * Implement validation logic using lambda. Input Format: Integer number.
 * Output Format: Validation result.*/
public class NumberValidationSystem {

	public static void main(String[] args) {
        int number = Integer.parseInt(IO.readln());

        NumberValidator<Integer,String> nv = num ->{
            if(num < 0){
                return "Negative Number";
            }else if(num == 0){
                return "Zero";
            }else{
                return "Positive Number";
            }
        };

        IO.println(nv.validate(number));
        
    }
}


@FunctionalInterface
interface NumberValidator<T,R>{
    R validate(T number);
}
