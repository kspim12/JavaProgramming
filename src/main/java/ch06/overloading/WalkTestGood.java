package ch06.overloading;

public class WalkTestGood {

    void walk() {
        walk(100, "cm");
    }

    void walk(int distance) {
        walk(distance, "cm");
    }

    void walk(int distance, String unit) {
        switch(unit) {
            case "cm":
                break;
            case "inch":
                distance *= 2.54;
                break;
            default:
                System.out.println("unknown");
                distance = 0;
        }
        System.out.println(distance +"cm 이동");
    }

    public static void main(String[] args) {
        WalkTestGood wtg = new WalkTestGood();
        wtg.walk();
        wtg.walk(100);
        wtg.walk(100, "cm");
    }
}
