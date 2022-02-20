import java.util.Scanner;

public class Skocimis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        String[] numbers = line.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);


        System.out.println(jump(a,b,c));

    }

    private static int jump(int a, int b, int c){
        if(b - a == 1 && c - b == 1){
            return 0;
        } else if(b - a > c - b){
            return 1 + jump(a, a+1, b);
        }else{
            return 1 + jump(b, b+1, c);
        }
    }
}
