import java.util.ArrayList;
import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            input.add(in.nextLine());
        }

        int maxScore = 0;
        int maxIndex = 0;
        int currIndex = 0;

        for(String s : input){
            int score = 0;

            String[] numbers = s.split(" ");

            for(int i = 0; i < 4; i++){
                score += Integer.parseInt(numbers[i]);
            }

            if(score > maxScore){
                maxIndex = currIndex;
                maxScore = score;
            }

            currIndex++;
        }

        System.out.println(maxIndex+1 + " " + maxScore);
    }
}
