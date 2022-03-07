import java.util.HashMap;
import java.util.Scanner;

public class Oktalni {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> bitMap = new HashMap<>();
        bitMap.put("000", "0");
        bitMap.put("001", "1");
        bitMap.put("010", "2");
        bitMap.put("011", "3");
        bitMap.put("100", "4");
        bitMap.put("101", "5");
        bitMap.put("110", "6");
        bitMap.put("111", "7");

        String bits = in.nextLine();

        int length = bits.length();

        StringBuilder sb = new StringBuilder();
        while(length % 3 != 0){
            sb.append("0");
            length++;
        }
        sb.append(bits);
        bits = sb.toString();

        sb = new StringBuilder();
        for(int i = 0; i+3 <= bits.length(); i += 3){
            sb.append(bitMap.get(bits.charAt(i)+""+bits.charAt(i+1)+""+bits.charAt(i+2)));
        }

        System.out.println(sb);

    }
}
