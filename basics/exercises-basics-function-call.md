# 基本概念 -- 使用函數 （練習）

## 第 1 題

修改以下的程式，並應用 `Math.pow()`， `Math.sqrt()`， `Math.min()` 計算註解裏描述的值。

```java
public class Exercise_Q1 {
    public static void main(String [] args) {
        double a = 2.5, b = 6.5, c, d;

        // 例： a-b 的絕對值
        System.out.println( Math.abs(a-b) );

        // (a+b) 的 0.5 次方  
        System.out.println(                      );

        // (a+b) 的平方根
        System.out.println(                      );

        // a 和 b 之中較小的值
        System.out.println(                      );
    }
}
```

---
## 第 2 題

呼叫 `Math.sqrt()` 時，如果其參數是個負數，那麽 `Math.sqrt()` 會回傳什麽值呢？

---
## 第 3 題

```java
public class Exercise_Q2 {
    public static void main(String [] args) {
        double a, b, c, d;

    }
}
```
修改以上的程式，使它能完成以下的任務：

* 將變數 a 和 b 的值分別初始化為 2 和 4
* 計算 c = √(2<sup>a</sup> + 2<sup>b</sup>)
* 計算 d = √(4<sup>b</sup> - 3<sup>b</sup>)
* 輸出 c 和 d 之中較大的值

