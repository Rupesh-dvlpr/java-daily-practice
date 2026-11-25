package BiPredicatefunction;
/*A forex application converts currency using BiFunction. The application takes amount and exchange rate as inputs and calculates the converted amount. 
Input Format: Amount, Exchange Rate. 
Output Format: Converted Amount.*/
import java.util.*;
import java.util.function.BiFunction;
public class CurrencyExchange {
    public static void main(String[] args) {
        double amount = Double.parseDouble(IO.readln());
        double exchange = Double.parseDouble(IO.readln());

        BiFunction<Double, Double, Double> ex = (amt, exchg)-> amount*exchange;
        IO.println("Converted Amount: "+ex.apply(amount, exchange));
    }
}
