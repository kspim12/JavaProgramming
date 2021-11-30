package ch06.login;

public class LoginSystem {

    public LoginResult doLogin(String id, String pass) {
        LoginResult result = new LoginResult();
        if ( id.equals("admin") && pass.equals("1234") ){
            result.result = true;
            result.message = id + " 님 반갑습니다.";
        } else if (!id.equals("admin")) {
            result.message = "아이디를 확인하세요.";
        } else {
            result.message = "비밀번호를 확인하세요.";
        }
        return result;
    }
}
