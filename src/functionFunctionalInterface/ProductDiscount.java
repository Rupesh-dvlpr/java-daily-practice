package functionFunctionalInterface;
/*An online store applies a flat 10% discount on all products during a sale.

Expectation:
Use Function<Double, Double> to return the final price after applying a 10% discount.

Sample Input: 1500
Expected Output: Discounted Price: Rs. 1350.0

Hint: apply()*/

import java.util.function.Function;
public class ProductDiscount {
    public static void main(String[] args) {
       double price = Double.parseDouble(IO.readln());
       Function<Double, Double> dis = pri -> pri-(pri * 0.1);
        IO.println("Discounted Price: Rs. "+dis.apply(price));
    }
}

