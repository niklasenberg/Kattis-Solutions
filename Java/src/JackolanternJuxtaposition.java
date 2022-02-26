import java.util.Scanner;

public class JackolanternJuxtaposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] numbers = line.split(" ");
        System.out.println(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]) * Integer.parseInt(numbers[2]));
    }
}
