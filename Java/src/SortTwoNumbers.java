import java.util.Scanner;

public class SortTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        String[] numbers = line.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if(a <= b){
            System.out.println(a + " " + b);
        }else{
            System.out.println(b + " " + a);
        }
    }
}
