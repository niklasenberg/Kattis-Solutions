import java.io.IOException;

public class Tarifa extends Solution{
    public static void main(String[] args) throws IOException {
        Tarifa tarifa = new Tarifa();

        tarifa.getInput("Java/Inputs/TarifaInput.txt");
        tarifa.calculate();
        tarifa.getInput("Java/Inputs/TarifaInput2.txt");
        tarifa.calculate();
        tarifa.getInput("Java/Inputs/TarifaInput3.txt");
        tarifa.calculate();
    }

    public void calculate(){
        int sum = 0;
        int x = Integer.parseInt(input.get(0));
        input.remove(0);
        input.remove(0);

        for(String s : input){
            int mbUsed = Integer.parseInt(s);

            if (mbUsed <= x){
                sum += (x - mbUsed);
            }
            else{
                sum -= (mbUsed - x);
            }
        }

        System.out.println(sum + x);

    }
}
