package ch10.nested;

public class DuplicatedNameTest {

    private int num = 100;

    class InnerClass {
        private int num = 200;

        public void method() {
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(DuplicatedNameTest.this.num);
        }
    }

    public static void main(String[] args) {
        DuplicatedNameTest dnt = new DuplicatedNameTest();
        InnerClass ic = dnt.new InnerClass();
        ic.method();;
    }
}
