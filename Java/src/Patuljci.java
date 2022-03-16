import java.util.ArrayList;
import java.util.Scanner;

public class Patuljci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> dwarves = new ArrayList<>();

        int sum = 0;
        for(int i = 0; i < 9; i++){
            int dwarf = in.nextInt();
            dwarves.add(dwarf);
            sum += dwarf;
        }

        int difference = sum - 100;

        ArrayList<Integer> toRemove = new ArrayList<>();
        for(int dwarfOne : dwarves){
            for(int dwarfTwo : dwarves){
                if(dwarfOne != dwarfTwo && dwarfOne + dwarfTwo == difference){
                    toRemove.add(dwarfOne);
                    toRemove.add(dwarfTwo);
                }
            }
        }

        dwarves.removeAll(toRemove);

        for(int dwarf : dwarves){
            System.out.println(dwarf);
        }
    }
}
