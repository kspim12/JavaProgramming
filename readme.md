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