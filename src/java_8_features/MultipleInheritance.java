package java_8_features;

interface Alpha {

    default void m1() {
        IO.println("m1 method of Alpha interface");
    }
}

interface Beta {

    default void m1() {
        IO.println("m1 method of Beta interface");
    }
}

class Implementer implements Alpha, Beta {

    @Override
    public void m1() {

        Alpha.super.m1();
        Beta.super.m1();

        IO.println("Overriding is compulsory, M1 is possible");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        new Implementer().m1();

    }
}
