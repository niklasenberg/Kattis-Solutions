/*
First tried simple bubble-sort but was too inefficient (O(N^2)), this algorithm is O(N).
 */

import java.util.HashMap;
import java.util.Scanner;

public class KindergartenExcursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        //Get input
        int n = line.length();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = Character.getNumericValue(line.charAt(i));
        }

        //Establish map to count previously occured values
        HashMap<Integer, Long> numberCount = new HashMap<>();
        numberCount.put(0, 0L);
        numberCount.put(1, 0L);
        numberCount.put(2, 0L);

        long swaps = 0; //Need long for overflow
        for(int i = 0; i < n; i++){
            int number = numbers[i];
            //Increase count for current number
            numberCount.put(number, numberCount.get(numbers[i])+1);

            //Get amount of lesser numbers encountered and count the swaps needed
            if(number == 0){
                swaps += numberCount.get(1) + numberCount.get(2);
            } else if(number == 1){
                swaps += numberCount.get(2);
            }
        }
        System.out.println(swaps);
    }
}
