package ch07.modifier;

class Parent{
    protected void method() {}
}

public class OverrideRule extends Parent{

    //Cannot reduce the visibility of the inherited method from Parent
    //void method() {}
    protected void method() {}
    //public void method() {}
}
