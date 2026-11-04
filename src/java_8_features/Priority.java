package java_8_features;

interface InterfaceA {

 default void show() {
     IO.println("Show default method of Interface A");
 }
}

class ClassB {

 public void show() {
     IO.println("Show concrete method of class B");
 }
}

class ClassC extends ClassB implements InterfaceA {
}

public class Priority {

 public static void main(String[] args) {

     ClassC c1 = new ClassC();
     c1.show();
 }
}