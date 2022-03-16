import java.util.PriorityQueue;
import java.util.Scanner;

public class Prva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();
        in.nextLine();

        char[][] board = new char[r][c];

        for(int i = 0; i < r; i++){
            String rowLine = in.nextLine();
            for(int k = 0; k < c; k++){
                board[i][k] = rowLine.charAt(k);
            }
        }

        PriorityQueue<String> heap = new PriorityQueue<>();

        //Rows
        for(int i = 0; i < r; i++){
            StringBuilder word = new StringBuilder();
            for(int k = 0; k < c; k++){
                if(board[i][k] != '#'){
                    word.append(board[i][k]);
                    if(k == c - 1 && word.length() >= 2){
                        heap.add(word.toString());
                    }
                }else{
                    if(word.length() >= 2){
                        heap.add(word.toString());
                    }
                    word = new StringBuilder();
                }
            }
        }

        //Columns
        for(int k = 0; k < c; k++){
            StringBuilder word = new StringBuilder();
            for(int i = 0; i < r; i++){
                if(board[i][k] != '#'){
                    word.append(board[i][k]);
                    if(i == r - 1 && word.length() >= 2){
                        heap.add(word.toString());
                    }
                }else{
                    if(word.length() >= 2){
                        heap.add(word.toString());
                    }
                    word = new StringBuilder();
                }
            }
        }

        System.out.println(heap.poll());
    }
}
