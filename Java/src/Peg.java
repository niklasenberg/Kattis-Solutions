import java.util.Scanner;

public class Peg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int rows = 7;
        final int columns = 7;
        //Establish board
        String[][] board = new String[rows][columns];
        for(int i = 0; i < rows; i++){
            String[] lineSplit = in.nextLine().split("");
            for(int k = 0; k < columns; k++){
                board[i][k] = lineSplit[k];
            }
        }

        //Count legal moves
        int legalCount = 0;
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < columns; k++){
                if(board[i][k].equals(".")){
                    if(i - 2 >= 0 && board[i-1][k].equals("o") && board[i-2][k].equals("o")){ //UP
                        legalCount++;
                    }
                    if(i + 2 <= 6 && board[i+1][k].equals("o") && board[i+2][k].equals("o")){ //DOWN
                        legalCount++;
                    }
                    if(k - 2 >= 0 && board[i][k-1].equals("o") && board[i][k-2].equals("o")){ //LEFT
                        legalCount++;
                    }
                    if(k + 2 <= 6 && board[i][k+1].equals("o") && board[i][k+2].equals("o")){ //RIGHT
                        legalCount++;
                    }
                }
            }
        }

        System.out.println(legalCount);

    }
}
