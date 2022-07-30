# 基本概念 -- 執行次序 （練習）

## 第 1 題

以下的程式會輸出什麽到控制台？
```java
public class Exercise_Q1 {
    public static void main(String [] args) {
        int a = 1, b = 2, c = 3;

        c = a + b;
        a = b;
        b = a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);                
    }
}
```

---
## 第 2 題

以下的程式會輸出什麽到控制台？
```java
public class Exercise_Q2 {
    public static void main(String [] args) {
        int a = 1, b = 2, c = 3;

        c = a + b;
        System.out.println(a);
        a = c - b;
        System.out.println(b);        
        b = c - a;
        System.out.println(c);     
    }
}
```