package ch09.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiExceptionHandling {

  public static void main(String[] args) {

    try {
      Class.forName("ch09.exception.MultiExceptionHandling");
      new FileInputStream("Hello.java");
      DriverManager.getConnection("Hello");
    } catch ( ClassNotFoundException e) {
      System.out.printf("클래스를 찾을 수 없습니다.:%s%n", e.getMessage());
    } catch ( FileNotFoundException e ) {
      System.out.printf("파일을 찾을 수 없습니다.:%s%n", e.getMessage());
    } catch ( SQLException e ) {
      System.out.printf("DB 접속 실패: %s%n", e.getMessage());
    }
    System.out.println("프로그램 정상 종료");
  }

}
