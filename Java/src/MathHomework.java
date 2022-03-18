import java.util.*;

public class MathHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int b = in.nextInt();
        int d = in.nextInt();
        int c = in.nextInt();
        int l = in.nextInt();

        ArrayList<int[]> combinations = new ArrayList<>();

        for (int i = 0; i <= l / b; i++) {
            for (int j = 0; j <= l / d; j++) {
                for (int k = 0; k <= l / c; k++) {
                    if (i * b + j * d + k * c == l) {
                        int[] combination = {i, j, k};
                        combinations.add(combination);
                    }
                }
            }
        }

        if (!combinations.isEmpty()) {
            for (int[] combination : combinations) {
                System.out.println(combination[0] + " " + combination[1] + " " + combination[2]);
            }
        } else {
            System.out.println("impossible");
        }
    }
}
