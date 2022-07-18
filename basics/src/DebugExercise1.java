import java.util.Scanner;

public class DebugExercise1 {

    public static void main(String [] args) {
        Scanner cin = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter three integers: ");
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();

        int tmp1 = b + a;
        int tmp2 = tmp1 * tmp1;
        int result = tmp2 % c;

        System.out.println("Result = " + result);
    }
}