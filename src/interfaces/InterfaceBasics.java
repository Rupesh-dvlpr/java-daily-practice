package interfaces;

interface Bank {
    double getCurrentBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

class Customer implements Bank {
    private double balance;

    public Customer(double balance) {
        this.balance = balance;
    }

    @Override
    public double getCurrentBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Amount cannot be deposited");
            return;
        }

        this.balance += amount;
        IO.println("After deposit " + amount + " amount balance is :" + getCurrentBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.err.println("Insufficient Balance, Withdraw is not possible");
            return;
        }

        this.balance -= amount;
        IO.println("After withdraw " + amount + " amount balance is :" + getCurrentBalance());
    }
}

public class InterfaceBasics {

    public static void main(String[] args) {

        Customer scott = new Customer(10000);

        IO.println("Current Balance is :" + scott.getCurrentBalance());

        scott.deposit(15000);
        scott.withdraw(10000);
    }
}

