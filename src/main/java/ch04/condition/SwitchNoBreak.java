package ch04.condition;

public class SwitchNoBreak {

    public static void main(String[] args) {
        String levelString = "";
        String level = "supervisor";

        switch(level) {
            case "supervisor":
                levelString += "oprator";
            case "operator":
                levelString += "manager";
            case "member":
                levelString += "write";
            default:
                levelString += "view";
        }
        System.out.println("your auth : " + levelString);
    }
}
