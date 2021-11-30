package ch06.variable;

public class VariableTypes {

    int instanceVariable;               // 인스턴스 멤버 변수
    static int classVariable;           // 클래스 멤버 변수

    public static void main(String[] args) {
        int localVariable = 10;                 // 로컬 변수
        for ( int i = 0; i < 100; i++) {        // 로컬 변수
            System.out.println(i);
        }
    }
}
