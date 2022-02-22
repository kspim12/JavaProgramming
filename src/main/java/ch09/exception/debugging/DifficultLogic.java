package ch09.exception.debugging;

import sun.util.resources.cldr.fi.CalendarData_fi_FI;

public class DifficultLogic {

    public DifficultLogic() {

    }

    public long factorial(int num) {
        if ( num == 1 ) {
            return 1;
        } else {
            return num * factorial(num -1 );
        }
    }

    public static void main(String[] args) {
        DifficultLogic dl = new DifficultLogic();
        System.out.println(dl.factorial(5));
    }
}
