import java.util.ArrayList;
import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            String line = in.nextLine();
            if(line.equals("-1")){
                break;
            }else{
                int n = Integer.parseInt(line);
                int miles = 0;
                int timeTotal = 0;
                for(int i = 0; i < n; i++){
                    line = in.nextLine();
                    String[] numbers = line.split(" ");

                    int s = Integer.parseInt(numbers[0]);
                    int t = Integer.parseInt(numbers[1]);

                    miles += (s * (t - timeTotal));

                    timeTotal = t;
                }
                System.out.println(miles + " miles");
            }
        }
    }
}
