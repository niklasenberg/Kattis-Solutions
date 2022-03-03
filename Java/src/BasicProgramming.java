import java.util.*;

public class BasicProgramming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nAndT = in.nextLine().split(" ");
        int n = Integer.parseInt(nAndT[0]);
        int t = Integer.parseInt(nAndT[1]);

        String[] strings = in.nextLine().split(" ");
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(strings[i]);
        }

        switch(t){
            case 1:
                tOne();
                break;
            case 2:
                tTwo(numbers);
                break;
            case 3:
                tThree(numbers);
                break;
            case 4:
                tFour(n, numbers);
                break;
            case 5:
                tFive(n, numbers);
                break;
            case 6:
                tSix(numbers);
                break;
            case 7:
                tSeven(n, numbers);
                break;
        }
    }

    private static void tSeven(int n, int[] numbers) {
        HashSet<Integer> visited = new HashSet<>();
        boolean running = true;
        int i = 0;
        i = numbers[i];

        while(running){
            if(i < 0 || i > n - 1){
                System.out.println("Out");
                running = false;
            }else if(i == n - 1){
                System.out.println("Done");
                running = false;
            }else if(visited.contains(i)){
                System.out.println("Cyclic");
                running = false;
            }else{
                visited.add(i);
                i = numbers[i];
            }
        }
    }

    private static void tSix(int[] numbers) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < 26; i++){
            map.put(i, alphabet[i]);
        }

        StringBuilder sb = new StringBuilder();

        for(int i : numbers){
            sb.append(map.get(i % 26));
        }

        System.out.println(sb);
    }

    private static void tFive(int n, int[] numbers) {
        long sumTwo = 0;
        for (int i = 0; i < n; i++){
            if(numbers[i] % 2 == 0){
                sumTwo += numbers[i];
            }
        }
        System.out.println(sumTwo);
    }

    private static void tFour(int n, int[] numbers) {
        long sumOne = 0;
        for (int i = 0; i < n; i++){
            sumOne += numbers[i];
        }
        System.out.println(sumOne);
    }

    private static void tThree(int[] numbers) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            numberList.add(numbers[i]);
        }

        Collections.sort(numberList);
        System.out.println(numberList.get(1));
    }

    private static void tTwo(int[] numbers) {
        if(numbers[0] > numbers[1]){
            System.out.println("Bigger");
        }else if (numbers[0] == (numbers[1])){
            System.out.println("Equal");
        }else{
            System.out.println("Smaller");
        }
    }

    private static void tOne() {
        System.out.println(7);
    }
}
