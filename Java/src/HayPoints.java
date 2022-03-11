import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HayPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.nextLine();

        HashMap<String, Integer> dictionary = new HashMap<>();

        for(int i = 0; i < m; i++){
            String[] line = in.nextLine().split(" ");
            dictionary.put(line[0], Integer.parseInt(line[1]));
        }

        for(int i = 0; i < n; i++){
            long haySum = 0;
            String word = in.next();
            while(!word.equals(".")){
                if(dictionary.containsKey(word)){
                    haySum += dictionary.get(word);
                }
                word = in.next();
            }
            System.out.println(haySum);
        }
    }
}
