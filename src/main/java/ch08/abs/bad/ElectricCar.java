package ch08.abs.bad;

public class ElectricCar {
    private int curX, curY;

    public void reportPosition() {
        System.out.printf("현재 위치는 (%d, %d) 입니다.%n", curX, curY);
    }

    public void addFuel() {
        System.out.printf("급속 충전");
    }
}
