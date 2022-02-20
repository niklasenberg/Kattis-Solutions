import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        String[] numbers = input.split(" ");

        int r = Integer.parseInt(numbers[0]);
        int s = Integer.parseInt(numbers[1]);
        int steps;

        if(r <= s){
            steps = s - r;
            System.out.println(s + steps);
        }else{
            steps = r - s;
            System.out.println(s - steps);
        }
    }
}
