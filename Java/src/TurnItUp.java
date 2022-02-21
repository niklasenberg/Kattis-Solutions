import java.util.Scanner;

public class TurnItUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int volume = 7;
        
        for(int i = 0; i < n; i++){
            String line = in.nextLine();
            if(line.equals("Skru op!")){
                if(volume < 10){
                    volume++;
                }
            }else if(line.equals("Skru ned!")){
                if(volume > 0){
                    volume--;
                }
            }
        }

        System.out.println(volume);

    }
}
