package BinaryOperatorFunction;
/*An academic system finds the maximum of two marks using BinaryOperator functional interface. 
Input Format: Two marks. 
Output Format: Highest marks.*/
import java.util.*;
import java.util.function.BinaryOperator;
public class HighestMarks {
    public static void main(String[] args) {
        int m1 = Integer.parseInt(IO.readln());
        int m2 = Integer.parseInt(IO.readln());

        BinaryOperator<Integer> marks = (mark, mark1)-> mark > mark1 ? mark : mark1;
        IO.println("Highest Marks: "+marks.apply(m1,m2));        
    }
}
