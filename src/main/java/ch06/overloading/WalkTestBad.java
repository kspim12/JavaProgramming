package ch06.overloading;

public class WalkTestBad {
    void walk() {
        System.out.println("100cm 이동");
    }

    void walk(int distance) {
        System.out.println(distance + "cm 이동");
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
        WalkTestBad wtb = new WalkTestBad();
        wtb.walk();
        wtb.walk(100);
        wtb.walk(100, "cm");
    }
}
