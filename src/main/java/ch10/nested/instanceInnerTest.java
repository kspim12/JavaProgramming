package ch10.nested;

public class instanceInnerTest {
    class Inner {
        int innerMember = 10;
        //static int staticMember = 10;
        static final int finalStaticMember = 20;

        private void innerMethod() {
            System.out.println("om : " + outerMember + ", im : " + innerMember);
        }
    }

    private int outerMember = 1;

    private void outerMethod() {
        Inner inner = new Inner();
        inner.innerMember = 100;
        inner.innerMethod();
    }

    public static void main(String[] args) {

        instanceInnerTest iit = new instanceInnerTest();
        Inner inner = iit.new Inner();
        inner.innerMethod();
    }
}
