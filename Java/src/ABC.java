import java.util.*;

public class ABC {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            input.add(in.nextLine());
        }

        //Format input
        String[] temp = input.get(0).split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for(String s : temp){
            numbers.add(Integer.parseInt(s));
        }

        //Create encoding
        HashMap<Character, Integer> decoder = new HashMap<>();
        decoder.put('C', Collections.max(numbers));
        decoder.put('A', Collections.min(numbers));
        for(Integer i : numbers){
            if(!decoder.containsValue(i)){
                decoder.put('B', i);
            }
        }

        //Create output
        String line = input.get(1);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 3; i++){
            if(i > 0){
                output.append(" ");
            }
            output.append(decoder.get(line.charAt(i)));
        }

        System.out.println(output);
    }
}
