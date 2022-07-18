import java.util.Scanner;

public class DebugExercise2 {

    public static void main(String [] args) {
        Scanner cin = new Scanner(System.in);

        int N;                      // Amount of water
        int large, medium, small;   // Number of buckets needed

        System.out.println("Amount of water (in liter): ");
        N = cin.nextInt();

        large = (int)(N / 1.2);

        medium = (int)((N - large * 1.2) / 0.5);

        small = (int)((N - large * 1.2 - medium * 0.5) / 0.1);
        
        System.out.println("Minimum cost: " + (large * 100 + medium * 45 + small * 10));
    }
}
