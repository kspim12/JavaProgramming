package ch06.constructor;

public class OverloadConstructorPerson {
    String name = "아무개";
    int age = 0;
    boolean isHungry = false;

    OverloadConstructorPerson(String name, int age, boolean isHungry ) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    OverloadConstructorPerson(String name, int age) {
        this(name, age, false);
    }

    OverloadConstructorPerson(String name) {
        this(name, 0, false);
    }

    OverloadConstructorPerson() {
        this("홍길동", 100, false);
    }
}
