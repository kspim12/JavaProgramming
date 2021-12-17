package ch08.abs.good;

abstract class Vehicle {
    private int curX, curY;

    public void reportPosition() {
        System.out.printf("현재 위치: (%d, %d)%n", curX, curY);
    }

    public abstract void addFuel();
}
class DieselSUV extends Vehicle {
    @Override
    public void addFuel() {
        System.out.println("주유소에서 급유");
    }
}

class ElectricCar extends Vehicle {
    @Override
    public void addFuel() {
        System.out.println("급속 충전");
    }
}

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle[] vehicles = { new DieselSUV(), new ElectricCar()};

        for ( Vehicle v : vehicles ) {
            v.addFuel();
            v.reportPosition();
        }
    }
}
