//TODO: finish

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FlowLayout {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        while(!line.equals("0")){
            input.add(line);
            line = in.nextLine();
        }

        HashMap<Integer, ArrayList<Pane>> paneMap = new HashMap<>();
        int sequenceLength = input.size();
        int maxWidth = 0;
        int currentWidth = 0;
        int currentHeight = 0;
        for(int i = 0; i < sequenceLength; i++){
            String[] numbers = input.get(i).split(" ");
            if(numbers.length == 1){
                maxWidth = Integer.parseInt(numbers[0]);
            } else{
                Pane pane = new Pane(Integer.parseInt(numbers[0]), Integer.parseInt((numbers[1])));
                if(pane.width == -1){
                    System.out.println(currentWidth + " x " + currentHeight);
                    currentHeight = 0;
                    currentWidth = 0;
                    paneMap.clear();
                }
            }
        }





    }

    private static class Pane{
        private final int width;
        private final int height;

        public Pane(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
