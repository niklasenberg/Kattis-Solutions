import java.util.Scanner;

public class TwoStones{
    int input;
    public static void main(String[] args) {
        TwoStones twoStones = new TwoStones();

        Scanner in = new Scanner(System.in);

        twoStones.input = in.nextInt();

        twoStones.calculate();
    }

    public void calculate(){
        if(input % 2 == 1){
            System.out.println("Alice");
        }else{
            System.out.println("Bob");
        }
    }
}
