package ch07.poly;

class SuperClass {
    String x = "super";
    public void method() {
        System.out.println("this is super class");
    }
}

class SubClass extends SuperClass {
    String x = "sub";
    public void method() {
        System.out.println("this is sub class");
    }
}
public class VirtualMethodCallTest {

    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        System.out.println(superClass.x);
        superClass.method();
    }
}
