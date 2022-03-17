import java.util.Scanner;

public class Ostgotska {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] line = in.nextLine().split(" ");

        double wordCount = line.length;
        double aeCount = 0;
        for(String s : line){
            if(s.contains("ae")){
                aeCount++;
            }
        }

        double percent = aeCount / wordCount;

        if(percent >= 0.4){
            System.out.println("dae ae ju traeligt va");
        }else{
            System.out.println("haer talar vi rikssvenska");
        }


    }
}
