import java.util.ArrayList;
import java.util.Scanner;

public class JumboJavelin {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            input.add(in.nextInt());
        }

        int n = input.get(0);
        input.remove(0);
        int sum = 0;
        for(int i : input){
            sum += i;
        }

        sum -= (n - 1);

        System.out.println(sum);
    }
}
