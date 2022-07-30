# 基本概念 -- 指定運算子 （練習）

## 第 1 題

以下每一段程式碼會在控制台輸出什麽？

a.   

```java
int a = 2, b = 5;
a += b += 1;
System.out.println(a);
System.out.println(b);
```

b.

```
int a = 2, b = 5;
a += b;
a = b += a;
System.out.println(a);
System.out.println(b);
```

c. 

```
int a = 2, b = 5;
a = a + b;
b = a - b;
a = a - b;
System.out.println(a);
System.out.println(b);
```

---
## 第 2 題
請嘗試在指定的區域内加程式碼（包括宣告新的變數）以便達成註解的要求。

```java
import java.util.Scanner();
public class Exercise_Q2 {
    public static void main(String [] args) {
        Scanner cin = new Scanner(System.in);

        int a, b, c;
        a = cin.nextInt(); 
        b = cin.nextInt(); 
        c = cin.nextInt();

        // ---- 區域開始 ----

        // 調動 a, b, c 的值，使它們分別得到 c, a, b 的值。
        // 如果調動前 a, b, c 分別是 1, 3, 5，那麽調動後 a, b, c 的值將會分別是 5, 1, 3。

        // ---- 區域結束 ----
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);                
    }
}
```




