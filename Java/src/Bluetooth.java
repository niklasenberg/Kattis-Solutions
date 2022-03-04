import java.util.HashMap;
import java.util.Scanner;

public class Bluetooth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        HashMap<String, String> teeth = new HashMap<>();

        for(int i = 1; i <= 8; i++){
            //Upper jaw
            teeth.put(i+"+", "ok");
            teeth.put("+"+i, "ok");
            //Lower jaw
            teeth.put(i+"-", "ok");
            teeth.put("-"+i, "ok");
        }

        for(int i = 0; i < n; i++){
            String[] problem = in.nextLine().split(" ");
            teeth.put(problem[0], problem[1]);
        }

        boolean rightOkay = true;
        int rightUpper = 0;
        int rightLower = 0;

        boolean leftOkay = true;
        int leftUpper = 0;
        int leftLower = 0;
        for(int i = 1; i <= 8; i++){
            if(teeth.get(i+"-").equals("b") || teeth.get(i+"+").equals("b")){
                rightOkay = false;
            }
            if(teeth.get("-"+i).equals("b") || teeth.get("+"+i).equals("b")){
                leftOkay = false;
            }

            if(teeth.get(i+"+").equals("ok")){
                rightUpper++;
            }

            if(teeth.get(i+"-").equals("ok")){
                rightLower++;
            }

            if(teeth.get("+"+i).equals("ok")){
                leftUpper++;
            }

            if(teeth.get("-"+i).equals("ok")){
                leftLower++;
            }
        }

        if(rightUpper == 0 || rightLower == 0){
            rightOkay = false;
        }
        if(leftUpper == 0 || leftLower == 0){
            leftOkay = false;
        }

        if(rightOkay){
            System.out.println(1);
        }else if(leftOkay){
            System.out.println(0);
        }else{
            System.out.println(2);
        }
    }
}
