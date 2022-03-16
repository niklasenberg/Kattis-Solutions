import java.util.HashMap;
import java.util.Scanner;

public class FlowLayout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maxWidth = in.nextInt();
        while (maxWidth != 0) {

            //Establish layout with maximum of 15 rows
            HashMap<Integer, int[]> paneMap = new HashMap<>();
            for (int i = 0; i < 15; i++) {
                paneMap.put(i, new int[2]);
            }

            //Get new pane
            int paneWidth = in.nextInt();
            int paneHeight = in.nextInt();
            while (paneWidth > 0) { //While input isnt -1 -1
                for (int rowIndex : paneMap.keySet()) { //For each row
                    int[] row = paneMap.get(rowIndex);
                    if (row[0] + paneWidth <= maxWidth) { //Check whether pane fits in width
                        if (rowIndex == 14 || paneMap.get(rowIndex + 1)[1] == 0) { //Check whether pane fits in height
                            row[0] += paneWidth; //Add pane to row
                            if (row[1] < paneHeight) {
                                row[1] = paneHeight; //Update height if new pane is higher
                            }
                            break;
                        }
                    }
                }

                //Get next pane
                paneWidth = in.nextInt();
                paneHeight = in.nextInt();
            }


            //Get final dimensions of layout
            int mapWidth = 0;
            int mapHeight = 0;
            for (int rowIndex : paneMap.keySet()) {
                if (paneMap.get(rowIndex)[0] > mapWidth) {
                    mapWidth = paneMap.get(rowIndex)[0];
                }
                mapHeight += paneMap.get(rowIndex)[1];
            }

            System.out.println(mapWidth + " x " + mapHeight);
            maxWidth = in.nextInt();
        }
    }
}
