import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        /*
        Stack would have been better, this is simply due to performance requirements
         */

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Integer[] array = new Integer[n];

        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }

        for(int i = n-1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
