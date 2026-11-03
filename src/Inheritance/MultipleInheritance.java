package Inheritance;
//Program

interface A {
 void m1();
}

interface B {
 void m1();
}

class C implements A, B {

 @Override
 public void m1() {
     IO.println("M1 is possible");
 }
}

public class MultipleInheritance {

 public static void main(String[] args) {

     new C().m1();

 }
}