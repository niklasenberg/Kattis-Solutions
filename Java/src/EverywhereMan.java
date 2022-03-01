import java.util.HashSet;
import java.util.Scanner;

public class EverywhereMan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int cityCount = in.nextInt();
            HashSet<String> cities = new HashSet<>();
            for(int k = 0; k <= cityCount; k++){
                cities.add(in.nextLine());
            }
            System.out.println(cities.size()-1);
        }
    }
}
