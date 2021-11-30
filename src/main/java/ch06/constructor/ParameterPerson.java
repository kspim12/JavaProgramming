package ch06.constructor;

public class ParameterPerson {
    String name;
    int age;
    boolean isHungry;

    ParameterPerson(String n, int a, boolean i) {
        name = n;
        age = a;
        isHungry = i;
    }

    public static void main(String[] args ) {
        ParameterPerson person = new ParameterPerson("홍길동", 10, true);
    }
}
