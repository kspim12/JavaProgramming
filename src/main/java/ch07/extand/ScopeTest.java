package ch07.extand;


class Parent {
    String x = "parent";
}

class Child extends Parent {
    String x = "child";

    void method() {
        String x = "method";
        System.out.println("x : " + x);
        System.out.println("this.x : " + this.x);
        System.out.println("super.x : " + super.x);
    }
}

public class ScopeTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}
