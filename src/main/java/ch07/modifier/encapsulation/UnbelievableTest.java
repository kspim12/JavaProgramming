package ch07.modifier.encapsulation;

class UnbelievableUserInfo {
    // 이름은 null이 될 수 없음.
    public String name = "홍길동";
    // 계좌는 0보다 커야 함.
    public int account = 10000;
}

public class UnbelievableTest {
    public static void main(String[] args) {
        UnbelievableUserInfo info = new UnbelievableUserInfo();
        System.out.printf("사용자 정보:%s, %d%n", info.name, info.account);
        info.name = null;
        info.account = -1000;
        System.out.printf("사용자 정보:%s, %d%n", info.name, info.account);
    }
}
