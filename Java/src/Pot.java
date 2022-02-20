import java.io.IOException;

public class Pot extends Solution{

    public static void main(String[] args) throws IOException {
        Pot pot = new Pot();

        pot.getInput("Java/Inputs/PotInput.txt");
        pot.calculate();
        pot.getInput("Java/Inputs/PotInput2.txt");
        pot.calculate();
        pot.getInput("Java/Inputs/PotInput3.txt");
        pot.calculate();
    }

    private void calculate() {
        int sum = 0;
        input.remove(0);

        for(String s : input){
            int exp = Integer.parseInt(s.substring(s.length()-1));
            int i = Integer.parseInt(s.substring(0,s.length()-1));
            sum += Math.pow(i, exp);
        }

        System.out.println(sum);
    }
}
