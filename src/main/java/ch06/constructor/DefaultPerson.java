package ch06.constructor;

public class DefaultPerson {

    String name;
    int age;
    boolean isHungry;

    //public DefaultPerson() {}

    public static void main(String[] args) {
        DefaultPerson person = new DefaultPerson();
        person.name = "홍길동";
        person.age = 10;
        person.isHungry = false;
    }
}
