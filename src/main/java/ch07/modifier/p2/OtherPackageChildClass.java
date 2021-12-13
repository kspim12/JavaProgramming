package ch07.modifier.p2;

import ch07.modifier.p1.Parent;

public class OtherPackageChildClass extends Parent {

    public void useMember() {
        this.publicVar = 10;
        this.protectVar = 10;
        // The field Parent.privVar is not visible
        // this.defaultVar = 10;
        // this.privVar = 1-;
    }
}
