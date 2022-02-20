import java.util.ArrayList;
import java.util.Scanner;

public class Tarifa{
    ArrayList<String> input = new ArrayList<>();

    public static void main(String[] args){
        Tarifa tarifa = new Tarifa();

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            tarifa.input.add(in.nextLine());
        }

        tarifa.calculate();
    }

    public void calculate(){
        int sum = 0;
        int x = Integer.parseInt(input.get(0));
        input.remove(0);
        input.remove(0);

        for(String s : input){
            int mbUsed = Integer.parseInt(s);

            if (mbUsed <= x){
                sum += (x - mbUsed);
            }
            else{
                sum -= (mbUsed - x);
            }
        }

        System.out.println(sum + x);

    }
}
