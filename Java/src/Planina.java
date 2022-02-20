import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int iterations = in.nextInt();
        int base = 2;
        int multiplier = 1;

        for (int i = 0; i < iterations; i++){
            base += multiplier;
            multiplier *= 2;
        }

        int sum = base * base;

        System.out.println(sum);

    }
}
