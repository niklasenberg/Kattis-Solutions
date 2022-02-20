import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            input.add(in.nextInt());
        }

        HashSet<Integer> numberSet = new HashSet<>();

        for(int i : input){
            numberSet.add(i % 42);
        }

        System.out.println(numberSet.size());
    }
}
