import java.util.ArrayList;
import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            input.add(in.nextLine());
        }

        input.remove(0);

        for(String line : input){
            String[] numbers = line.split(" ");
            int r = Integer.parseInt(numbers[0]);
            int e = Integer.parseInt(numbers[1]);
            int c = Integer.parseInt(numbers[2]);

            if(e - c > r){
                System.out.println("advertise");
            }else if(e - c == r){
                System.out.println("does not matter");
            }else{
                System.out.println("do not advertise");
            }
        }
    }
}
