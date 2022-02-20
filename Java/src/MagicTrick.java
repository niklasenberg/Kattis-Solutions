import java.util.HashSet;
import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        HashSet<Character> characters = new HashSet<>();

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        for(int i = 0; i < line.length(); i++){
            characters.add(line.charAt(i));
        }

        if(characters.size() == line.length()){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
