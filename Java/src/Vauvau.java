import java.util.ArrayList;
import java.util.Scanner;

public class Vauvau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        ArrayList<Integer> humans = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            humans.add(in.nextInt());
        }

        for (int arrival : humans) {
            int bitCount = 0;

            if (arrival % (a + b) != 0 && arrival % (a + b) <= a) {
                bitCount++;
            }

            if (arrival % (c + d) != 0 && arrival % (c + d) <= c) {
                bitCount++;
            }

            switch (bitCount) {
                case 0:
                    System.out.println("none");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("both");
            }
        }
    }
}
