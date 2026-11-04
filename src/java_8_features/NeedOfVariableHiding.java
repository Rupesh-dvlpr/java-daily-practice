package java_8_features;

interface A {
 int x = 100;
}

abstract class B {
 int x = 200;
}

class C extends B implements A {

 int x = 300; // Variable Hiding

 public void display() {
     IO.println(x);
 }
}

public class NeedOfVariableHiding {

 public static void main(String[] args) {

     new C().display();

 }
}