import java.util.ArrayList;
import java.util.Scanner;

public class RatingProblems {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            input.add(in.nextLine());
        }

        String[] numbers = input.get(0).split(" ");
        input.remove(0);
        double n = Integer.parseInt(numbers[0]);
        double k = Integer.parseInt(numbers[1]);

        int currentSum = 0;

        for(String s : input){
            currentSum += Integer.parseInt(s);
        }

        double judgesLeft = n - k;

        double maxRating = (currentSum + (judgesLeft * 3)) / n;
        double minRating = (currentSum + (judgesLeft * - 3)) / n;

        System.out.println(minRating + " " + maxRating);

    }
}
