package ch03.bit;

public class BitMask {

    public static void main(String[] args) {
        int homeElecStatus = 0;
        int tvCheck = 0b1;
        String result = "";
        result = (homeElecStatus & tvCheck ) > 0 ? "on":"off";
        System.out.println("tv status : " + result);

        // tv 켜지
        homeElecStatus |= tvCheck;
        result = (homeElecStatus & tvCheck ) > 0 ? "켜짐": "꺼짐";
        System.out.println("tv 상태(켜기) : " + result);

        //tv 상태 반전
        homeElecStatus ^= tvCheck;
        result = (homeElecStatus & tvCheck) > 0 ? "켜짐":"꺼짐";
        System.out.println("tv 상태(반전) : " + result);

        //tv 끄기
        homeElecStatus &= ~tvCheck;
        result = (homeElecStatus & tvCheck ) > 0 ? "켜짐":"꺼짐";
        System.out.println("tv 상태(끄기) : " + result);
    }
}
