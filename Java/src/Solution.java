import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    protected ArrayList<String> input = new ArrayList<>();

    protected void getInput(String fileName) throws IOException {
        input.clear();
        FileReader fileReader = new FileReader(fileName);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        for(line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
            input.add(line);
        }
    }
}
