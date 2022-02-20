import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pot{
    private ArrayList<String> input = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Pot pot = new Pot();

        for(int i = 1; i < 4; i++){
            pot.getInput(i);
            pot.calculate();
        }
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

    private void getInput(int number) throws IOException {
        input.clear();
        FileReader fileReader;

        if(number == 1){
            fileReader = new FileReader("Java/Inputs/PotInput.txt");
        }
        else if(number == 2){
            fileReader = new FileReader("Java/Inputs/PotInput2.txt");
        }
        else{
            fileReader = new FileReader("Java/Inputs/PotInput3.txt");
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        for(line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
            input.add(line);
        }
    }
}
