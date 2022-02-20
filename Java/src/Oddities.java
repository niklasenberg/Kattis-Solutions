import java.util.ArrayList;
import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            input.add(in.nextInt());
        }

        input.remove(0);

        for(int i : input){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            }else{
                System.out.println(i + " is odd");
            }
        }

    }
}
