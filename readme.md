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
            
