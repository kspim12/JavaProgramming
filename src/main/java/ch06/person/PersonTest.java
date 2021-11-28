package ch06.person;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "홍길동";
        person1.isHungry = true;
        System.out.println(person1.name + ":" + person1.isHungry);
        person1.eat();
        System.out.println(person1.name + ":" + person1.isHungry);

        Person person2 = new Person();
        person2.name = "임꺽정";
        person2.isHungry = true;
        System.out.println(person2.name + ":" + person2.isHungry);
        System.out.println(person1.name + ":" + person1.isHungry);

    }
}
