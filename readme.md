#Chapter 3. 연산자

1. 연산자란

2. 결합 방향과 우선순위

3. 연산자의 종류<br>
 3.1 산술연산자<br>
   (1) 산술 연산 시 형변환 
   ```
   byte b1 = 10;
   byte b2 = 20;
   //byte b3 = b1 + b2; 
   //Type mismatch: cannot convert from int to byte
   
   int i1 = 100;
   long l1 = 200;
   //int i2 = i1 + l1;
   //Type mismatch : cannot convert from long to int
   ```
   
## ShortCircuit
```
int a = 10;
int b = 20;
System.out.println((a+10) > 15 | (b -= 10 ) > 15);
System.out.println("a = " + a + ", b = " + b);

a = 10;
b = 20;
System.out.println((a += 10) > 15 || (b -= 10) > 15);
System.out.println("a = " + a + ", b = " + b);
```


## 특이점
            //왜 ??
            // System.out.printf("test")
            // int result = scanner.nextInt();
            // test 가 input 받기 전에 출력이 안됨 ;; 
            
5. 배열<br>
5.1 배열의 기본<br>
 
```
    int[] point = new int[3];
    int[] iArray1 = {100, 200};
    int[] iArray2;
    // iArray2 = {100, 200}; // 문법 오류
    int[] iArray3 = new int[]{100, 200};
    int[] iArray4;
    iArray4 = new int[]{100, 200};
```

5.2 다차원 배열 <br>
``` 
int[][] arr2Dim = new int[2][3];
```


6. 클래스와 객체<br>
```markdown
클래스영역 
    - Field 정보
    - Method 정보
    - Type 정보
    - 상수 풀

스택 영역 : 스레드별로 별도의 공간을 가진다. 
힙 영역 : 여러 스레드가 공유한다.
```

``` 
초기화블록
int iv;
static int cv;

static{
    System.out.println("클래스 초기화 블록 : static 멤버 변수에 대한 초기화");
    cv = 100;
}

{
    System.out.println("인스턴스 초기화 블록 : instance 멤버 변수에 대한 초기화");
    iv = 100;
}
```


7. 클래스의 관계

 - 상속관계 : is~a 관계
 - subClass 는 sureClass 이다.
 - spiderMan은 person 이다.
 - 포함관계(interface) : has~a관계
 - 메서드 오버라이딩 5개 규칙
```markdown
1. 메서드 이름은 조상 클래스의 메서드 이름과 같아야 한다.
2. 매개변수의 개수, 타입, 순서는 조상 클래스의 메서드와 같아야 한다.
3. 리턴 타입은 조상 클래서의 메서드와 같아야 한다.
4. 접근 제한자는 조상 클래스의 메서드보다 범위가 같거나 넓어야 한다.
5. 조상 클래스의 메서드보다 더 상위의 예외를 던질 수 는 없다.
```
 - 가상 메서드 호출 (virtual method call) (VirtualMethodCallTest)
``` 
상속관계에서 멤버변수는 참조한 대상의 변수를 가져오게 되지만,
메서드는 무조건 오버라이딩된 자식 클래스의 메서드가 호출 된다.
```


8. 나머지 주요 구성요소
8-1. 추상클래스 

8-2. 인터페이스
 - 인터페이스의 모든 변수들은 public static final 이다. 생략 가능하다.
 - 모든 메서드는 public abstract 이다. 생략 가능하다.
 - 인터페이스가 다른 인터페이서를 상속 할 수도 있다. 마찬가지로 extends를 사용한다.
 - 인터페이스는 여러개의 인터페이스를 상속 받을 수 있다.

8-3. Enum

8-4. Annotation

8-5. Generic


9. 예외 처리와 디버깅