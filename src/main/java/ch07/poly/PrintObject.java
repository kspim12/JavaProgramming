package ch07.poly;

class UserInfo{
    String name = "홍길동";

    @Override
    public String toString() {
        return "이름: " + this.name;
    }
}

class MemberInfo extends UserInfo {
    String grade = "정화원";

    @Override
    public String toString() {
        return super.toString() + ", 등급: " + this.grade;
    }
}

public class PrintObject {

    public static void main(String[] args) {
        Object member = new MemberInfo();
        System.out.println("객체 정보 : " + member);
    }

}
