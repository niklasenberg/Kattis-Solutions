import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        in.nextLine();

        HashMap<Integer, HashSet<Character>> columnMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            String row = in.nextLine();
            for(int l = 0; l < m; l++){
                columnMap.putIfAbsent(l, new HashSet<>());
                columnMap.get(l).add(row.charAt(l));
            }
        }

        int colorCount = 0;
        HashSet<Character> seen = new HashSet<>();
        for(HashSet<Character> column : columnMap.values()){
            if(Collections.disjoint(seen, column)){
                colorCount++;
            }
            seen.addAll(column);
        }

        System.out.println(colorCount);
    }
}
