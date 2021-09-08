package ch04.condition;

public class SwitchSimple {

    public static void main(String[] args) {
        int level = 0;
        String levelString = "";
        switch(level) {
            case 0:
                levelString = "operator, manage, write, view";
                break;
            case 1:
                levelString = "manage, write, view";
                break;
            case 2:
                levelString = "write, view";
                break;
            default:
                levelString = "view";
        }
        System.out.println("your auth : " + levelString);
    }
}
