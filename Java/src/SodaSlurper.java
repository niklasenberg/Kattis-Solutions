import java.util.Scanner;

public class SodaSlurper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        String[] numbers = line.split(" ");

        int e = Integer.parseInt(numbers[0]);
        int f = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        calculate(e,f,c);
    }
    public static void calculate(int e, int f, int c) {
        int slurped = 0;
        e = e + f;
        while(e >= c){
            e -= c;
            slurped++;
            e++;
        }
        System.out.println(slurped);
    }
}
