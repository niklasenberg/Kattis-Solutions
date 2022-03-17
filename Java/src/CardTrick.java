import java.util.ArrayList;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            ArrayList<Integer> cards = new ArrayList<>();

            for(int j = n; j > 0; j--){
                cards.add(0, j);

                for(int k = 0; k < j; k++){
                    cards.add(0, cards.remove(cards.size()-1));
                }
            }

            for(int c : cards){
                System.out.print(c + " ");
            }
            System.out.println();

        }
    }
}
