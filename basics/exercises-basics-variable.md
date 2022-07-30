# 基本概念 -- 變數 （練習）

## 第 1 題

以下哪幾個（多於一個）宣告變數的方式會導致編譯錯誤？

a.
```
int var1, var2,
foo;
```
b.
```
int var1, var2,
double var3;
```
c.
```
int var1=1, var2, var3=1;
``` 
d.
```
double var1; var2; var3;
```

---
## 第 2 題

爲何以下的程式於編譯時會出現編譯錯誤？
```java
public class Exercise_Q2 {
    public static void main(String [] args) {
        int num1, num2;

        num1 = num2;
        num2 = 10;

        System.out.println(num1 + num2);
    }
}
```

---
## 第 3 題

爲何以下的程式於編譯時會出現編譯錯誤？
```java
public class Exercise_Q3 {
    public static void main(String [] args) {
        int num1, num2;
        int result;

        num1 = 1;
        num2 = 10;
        Result = num1 + num2;

        System.out.println(Result);
    }
}
```