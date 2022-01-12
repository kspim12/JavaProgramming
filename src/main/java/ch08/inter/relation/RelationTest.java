package ch08.inter.relation;

class Phone{}

class HandPhone extends Phone implements Chargeable {
    public void charge() {
        System.out.println("HandPhone 충전 중...");
    }
}

class Camera {}
class DigitalCamera extends Camera implements Chargeable {
    public void charge() {
        System.out.println("BlackBox 충전 중...");
    }
}

interface Chargeable {
    void charge();
}


public class RelationTest {

    void badCase() {
        Object[] objs = {new HandPhone(), new DigitalCamera()};
        for (Object obj: objs) {
            if (obj instanceof HandPhone) {
                HandPhone phone = (HandPhone)obj;
                phone.charge();
            } else if (obj instanceof DigitalCamera){
                DigitalCamera camera = (DigitalCamera) obj;
                camera.charge();

            }
        }
    }

    void goodCase() {
        Chargeable[] objs = {new HandPhone(), new DigitalCamera()};
        for (Chargeable obj: objs) {
            obj.charge();
        }
    }

    public static void main(String[] args) {
        RelationTest lct = new RelationTest();
        lct.badCase();
        lct.goodCase();
    }
}
