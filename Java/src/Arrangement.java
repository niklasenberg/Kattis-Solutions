import java.util.Scanner;

public class Arrangement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int remainder = m % n;

        for(int i = 0; i < n; i++){
            for(int k = 0; k < m/n; k++){
                System.out.print("*");
            }
            if(remainder > 0){
                System.out.print("*");
                remainder--;
            }
            System.out.println();
        }
    }
}
