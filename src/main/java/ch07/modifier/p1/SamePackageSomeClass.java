package ch07.modifier.p1;

public class SamePackageSomeClass {
    public void method() {
        Parent p = new Parent();
        p.publicVar = 10;
        p.protectVar = 10;
        p.defaultVar = 10;
        // The field Parent.privVar is not visible
        // p.privVar = 10;
    }
}
