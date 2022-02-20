import java.util.ArrayList;
import java.util.Scanner;

public class QALY {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            input.add(in.nextLine());
        }
        input.remove(0);

        double qaly = 0;


        for(String s : input){
            String[] numbers = s.split(" ");

            double q = Double.parseDouble(numbers[0]);
            double y = Double.parseDouble(numbers[1]);

            qaly += (q*y);
        }

        System.out.print(qaly);

    }
}
