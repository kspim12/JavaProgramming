package ch09.exception;

public class InstallTool {
    
    void copy() {
        System.out.println("파일 복사");
    }
    
    void install() throws Exception {
        System.out.println("설치");
        double a = Math.random();
        System.out.println(a);
        if (  a > 0.5 ) {
            throw new Exception("설치 과정에서 문제 발생");
        }
    }
    
    void delete() {
        System.out.println("파일 삭제");
    }
    
    
}
