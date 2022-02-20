import java.util.ArrayList;
import java.util.Scanner;

public class Heliocentric {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            input.add(in.nextLine());
        }

        int caseNo = 0;
        for(String s : input){
            caseNo++;
            String[] numbers = s.split(" ");

            int earth = Integer.parseInt(numbers[0]);
            int mars = Integer.parseInt(numbers[1]);
            int dayCounter = 0;

            while(earth != 0 || mars != 0){
                dayCounter++;
                earth++;
                mars++;

                if(earth > 364){
                    earth = 0;
                }

                if(mars > 686){
                    mars = 0;
                }
            }
            System.out.println("Case " + caseNo + ": " + dayCounter);
        }
    }
}
