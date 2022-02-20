import java.util.Scanner;

public class Nsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        in.nextLine();

        String line = in.nextLine();
        String[] numbers = line.split(" ");

        int sum = 0;
        for(String s : numbers){
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);

    }
}
