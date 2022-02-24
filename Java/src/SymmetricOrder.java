import java.util.ArrayList;
import java.util.Scanner;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); //Establish n for set
        int setNumber = 1; //Establish set counter

        while(n != 0){
            ArrayList<String> set = new ArrayList<>();
            set.add("temp"); //Add temp for math to work

            for(int i = 0; i <= n; i++){ //For each name in set
                String line = in.nextLine(); //Get name
                if(!line.isEmpty()){
                    set.add((set.size() / 2) + 1, line); //Place name
                }
            }

            set.remove(0); //Remove temp
            set.add(0 ,"SET " + setNumber); //Add set label

            for(String s : set){
                System.out.println(s); //Print set
            }

            setNumber++; //Go to next set
            n = in.nextInt(); //Get next n 
        }
    }
}