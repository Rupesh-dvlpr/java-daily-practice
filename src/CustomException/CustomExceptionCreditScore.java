package CustomException;

/*A banking program allows users to apply for loans. If a user’s credit score is below the minimum required score, the program should throw a custom exception (e.g., LoanNotEligibleException).

Input Format
-------------------
Credit Score: 500
Minimum Required Score: 650

Output Format
-----------------------
LoanNotEligibleException: Credit score 500 insufficient for loan

Additional Notes:
Users with credit scores above or equal to the minimum can apply successfully.
This demonstrates custom exception handling for business logic rules in Java.*/

import java.util.*;

public class CustomExceptionCreditScore {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int requiredCreditScore;
       int creditScore;
        try(sc){
            requiredCreditScore = sc.nextInt();
            creditScore = sc.nextInt();
            if(creditScore > requiredCreditScore){
                throw new LoanNotEligibleException("Credit score "+requiredCreditScore+" insufficient for loan");
            }
            System.out.println("Loan approved. Eligible for loan");
        }catch(LoanNotEligibleException e){
            System.out.println(e);
        }
    }
}

class LoanNotEligibleException extends Exception{
    LoanNotEligibleException(){

    }
    LoanNotEligibleException(String msg){
        super(msg);
    }
}
