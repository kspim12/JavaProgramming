package ch09.exception.custom;

public class UserManagerWithException {

    public boolean login(String id, String pass ) {
        if ( !id.equals("hong")) {
            throw new LoginFailException(LoginFailException.ErrorCode.INVALID_ID, id);
        } else if ( !pass.equals("1234")) {
            throw new LoginFailException(LoginFailException.ErrorCode.INVALID_PASS, pass);
        }
        return true;
    }

    public static void main(String[] args) {

        UserManagerWithException userManager = new UserManagerWithException();
        try {
            boolean result = userManager.login("hong", "1234");
            // boolean result = userManager.login("hong2", "1234");
            // boolean result = userManager.login("hong", "5678");
            System.out.printf("로그인 성공 여부: %b%n", result);
        } catch ( LoginFailException e ) {
            System.out.printf("예외 처리: %s%n", e.getLocalizedMessage());
        }
    }
}
