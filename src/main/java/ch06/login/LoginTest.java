package ch06.login;

public class LoginTest {

    public static void main(String[] args ) {
        LoginSystem login = new LoginSystem();
        LoginResult result = login.doLogin("hong", "1234");
        result.printResult();

        result = login.doLogin("admin", "12345");
        result.printResult();

        result = login.doLogin("admin", "1234");
        result.printResult();
    }
}
