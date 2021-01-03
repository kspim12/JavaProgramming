package format;

import java.util.Calendar;

public class DateFormatting {

    public static void main(String[] args) {
        Calendar currentTime = Calendar.getInstance();
        System.out.printf("%tA %<B %<te, %<tY %n", currentTime);
        System.out.printf("%tD %n", currentTime);
        System.out.printf("%tF %n", currentTime);
        System.out.printf("%tc %n", currentTime);
        System.out.printf("오늘은 %tF 이고 지금은 %<tR 입니다. %n", currentTime);
    }
}
