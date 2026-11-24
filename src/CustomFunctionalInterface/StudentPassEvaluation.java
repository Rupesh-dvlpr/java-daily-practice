package CustomFunctionalInterface;
/*A university wants to evaluate student results using a custom functional interface. The evaluation logic must be written using a lambda expression and passed as a parameter to a method instead of writing conditions directly. Create an interface ResultEvaluator with one abstract method to evaluate marks. Input Format: Student Marks. Output Format: Display Pass or Fail status.

A university wants to check whether a student has passed or failed based on marks.
Instead of writing if-else directly in the main program, the university wants to inject the evaluation logic using a lambda expression.

You must create a custom functional interface to evaluate the student result.

The program should:

Read student marks from the user.

Create a functional interface ResultEvaluator.

Implement the evaluation logic using a lambda expression.

Pass the lambda to a method and display Pass or Fail.*/
public class StudentPassEvaluation {
    public static void main(String[] args) {
        int marks = Integer.parseInt(IO.readln());

        ResultEvaluator<Integer, String> re = mark->{
            if(mark>30){
                return "Pass";
            }else{
                return "Fail";
            }
        };

        IO.println(re.evaluate(marks));
        
    }
}

@FunctionalInterface
interface ResultEvaluator<T,R>{
    R evaluate(T marks);
}
