import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pot{
    ArrayList<String> input = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Pot pot = new Pot();

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            pot.input.add(in.nextLine());
        }

        pot.calculate();
    }

    private void calculate() {
        int sum = 0;
        input.remove(0);

        for(String s : input){
            int exp = Integer.parseInt(s.substring(s.length()-1));
            int i = Integer.parseInt(s.substring(0,s.length()-1));
            sum += Math.pow(i, exp);
        }

        System.out.println(sum);
    }
}
