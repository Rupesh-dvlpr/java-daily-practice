package CustomException;
/*A banking program allows users to withdraw money, but enforces a daily withdrawal limit. If a user attempts to withdraw an amount exceeding the daily limit, the program should throw a custom exception (e.g., DailyLimitExceededException).

Input Format
-------------------
Daily Limit: 10000
Withdraw Amount: 15000

Output Format
-----------------------
DailyLimitExceededException: Withdraw 15000 exceeds limit 10000

Additional Notes:
Withdrawals within the daily limit should succeed.
This demonstrates custom exception handling for enforcing business rules in Java.*/

import java.util.*;

public class CustomExceptionDailyLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dailyLimit;
        double withdraw;
        try(sc){
            dailyLimit = sc.nextInt();
            withdraw = sc.nextDouble();

            if(dailyLimit < withdraw){
                throw new DailyLimitExceededException("Withdraw "+(int)withdraw+" exceeds limit "+dailyLimit);
            }else{
                System.out.println("Withdrawal successful. Remaining daily limit: "+(dailyLimit-withdraw));
            }
        }catch(DailyLimitExceededException e){
            System.out.println(e);
        }
        finally {
        	sc.close();
        }
    }
}

class DailyLimitExceededException extends Exception{
    DailyLimitExceededException(){

    }

    DailyLimitExceededException(String msg){
        super(msg);
    }
}