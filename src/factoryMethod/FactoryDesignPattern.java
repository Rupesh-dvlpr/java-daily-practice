package factoryMethod;

interface Payment {
  void makePayment(double amount);
}

class UPI implements Payment {
  @Override
  public void makePayment(double amount) {
      IO.println(amount + " amount is paid through UPI");
  }
}

class CreditCard implements Payment {
  @Override
  public void makePayment(double amount) {
      IO.println(amount + " amount is paid through CreditCard");
  }
}

class DebitCard implements Payment {
  @Override
  public void makePayment(double amount) {
      IO.println(amount + " amount is paid through DebitCard");
  }
}

class PaymentFactory {
  // Factory Design Pattern
  public static Payment getPaymentType(String paymentType) {

      if (paymentType.equalsIgnoreCase("UPI")) {
          return new UPI();
      }
      else if (paymentType.equalsIgnoreCase("CreditCard")) {
          return new CreditCard();
      }
      else {
          return new DebitCard();
      }
  }
}

public class FactoryDesignPattern {

  public static void main(String[] args) {

      Payment p = null;

      while (true) {

          IO.println("Payment Menu");
          IO.println("1) UPI Payment");
          IO.println("2) CreditCard Payment");
          IO.println("3) DebitCard Payment");
          IO.println("4) Exit from Application");

          int choice = Integer.parseInt(IO.readln("Enter your Choice : "));

          switch (choice) {

              case 1 -> {
                  String type = IO.readln(
                      "Enter your payment type [UPI/ CreditCard /DebitCard] : "
                  );
                  p = PaymentFactory.getPaymentType(type);
                  p.makePayment(12000);
              }

              case 2 -> {
                  String type = IO.readln(
                      "Enter your payment type [UPI/ CreditCard /DebitCard] : "
                  );
                  p = PaymentFactory.getPaymentType(type);
                  p.makePayment(15000);
              }

              case 3 -> {
                  String type = IO.readln(
                      "Enter your payment type [UPI/ CreditCard /DebitCard] : "
                  );
                  p = PaymentFactory.getPaymentType(type);
                  p.makePayment(20000);
              }

              case 4 -> {
                  IO.println("Thank you banking with us");
                  System.exit(0);
              }
          }
      }
  }
}