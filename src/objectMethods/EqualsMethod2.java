package objectMethods;

/***You are developing a Product Comparison System for an online shopping platform.

Two product objects should be treated as equal if they share the same product code, regardless of their name or price.
To support this behavior, you must override the equals() and hashCode() methods of the Object class.
In the hashcode() return any of class property which is having integer datatype

Class Details

Create a class named Product.

Data Members
String productCode // unique product identifier
String productName // product display name
double price // product price

Constructor
Product(String productCode, String productName, double price)
Initializes all fields.

Override equals(Object obj)

Logic
If both objects have the same productCode, return true.
Otherwise, return false.

Main Class Details

Create a class named ProductApp.

Use Scanner to read details of two products:
Product code
Product name
Price

Create two Product objects.
Compare them using equals().

If equal → print
Products are equal

Else → print
Products are not equal*/


import java.util.*;

public class EqualsMethod2 {
    public static void main(String[] args) {
        String productCode = IO.readln("Enter product Code: ");
        String productName = IO.readln("Enter product Name: ");
        double price = Double.parseDouble(IO.readln("Enter product price: "));

        Product p1 = new Product(productCode, productName, price);


         String productCode2 = IO.readln("Enter product code: ");
        String productName2 = IO.readln("Enter product Name: ");
        double price2 = Double.parseDouble(IO.readln("Enter product price: "));

        Product p2 = new Product(productCode2, productName2, price2);

        if(p1.equals(p2)){
            IO.println("Products are equal");
        }else{
            IO.println("Products are not equal");
        }
    }
}

class Product{
    private String productCode;
    private String productName;
    private double price;

    Product(String productCode, String productName, double price){
        super();
        this.productCode = productCode;
        this.productName = productName;
        if(price<0){
            IO.println("Error: Price must be greater than zero");
            System.exit(0);
        }
        this.price = price;
    }

     @Override
     public int hashCode(){
     return productCode.hashCode();
     }

    @Override
    public boolean equals(Object obj){
        String code = this.productCode;

        Product p2 = (Product) obj;
        String code2 = p2.productCode; 
        if(code.equals(code2)){
            return true;
        }else{
            return false;
        }
    }
}