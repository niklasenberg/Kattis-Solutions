import java.util.ArrayList;
import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> input= new ArrayList<>();

        while(in.hasNext()){
            input.add(in.nextLine());
        }

        String line = input.get(0);
        input.remove(0);

        String[] numbers = line.split(" ");

        int w = Integer.parseInt(numbers[1]);
        int h = Integer.parseInt(numbers[2]);

        double maxLength = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));

        for(String s : input){
            if(Integer.parseInt(s) <= maxLength){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}
