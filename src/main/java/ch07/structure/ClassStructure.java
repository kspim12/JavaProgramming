package ch07.structure;

public class ClassStructure {

    String name;
    int age;

    { name = "andy"; }

    public ClassStructure(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        ClassStructure cs = new ClassStructure("hong", 10);

    }
}
