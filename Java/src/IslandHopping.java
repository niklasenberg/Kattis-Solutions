//WORK IN PROGRESS
//Needs implementation of Graph to be viable

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class IslandHopping {
    private ArrayList<String> input = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        IslandHopping islandHopping = new IslandHopping();
//        Scanner in = new Scanner(System.in);
//
////        while(in.hasNext()){
////            input.add(in.nextLine());
////        }

        FileReader fileReader = new FileReader("/Users/niklasenberg/Desktop/islandinput.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        String line = reader.readLine();
        while(line != null){
            islandHopping.input.add(line);
            line = reader.readLine();
        }


        islandHopping.run();

    }

    private void run() {
        int n = Integer.parseInt(input.get(0));

        int caseIndex = 1;

        for(int i = 0; i < n; i++){ //Cases
            HashMap<Point2D.Double, ArrayList<Point2D.Double>> islands = new HashMap<>();
            ArrayList<Edge> edges = new ArrayList<>();
            int m = Integer.parseInt(input.get(caseIndex)); //Amount of islands for this case

            //Establish islands and edges
            for(int k = 1; k <= m; k++){ //For each island
                String[] coordinates = input.get(caseIndex+k).split(" ");
                double x = Double.parseDouble(coordinates[0]);
                double y = Double.parseDouble(coordinates[1]);
                Point2D.Double currentIsland = new Point2D.Double(x,y);

                islands.put(currentIsland, new ArrayList<>());

                for(Point2D.Double island : islands.keySet()){
                    islands.get(currentIsland).add(island);
                    edges.add(new Edge(currentIsland, island));
                    System.out.println(island);
                }
            }

            //MST via Prims algorithm
            ArrayList<Point2D.Double> visitedIslands = new ArrayList<>();
            PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
            double sum = 0;

            priorityQueue.addAll(edges);

            //Pick random starting island
            Map.Entry<Point2D.Double, ArrayList<Point2D.Double>> entry = islands.entrySet().iterator().next();
            Point2D.Double startIsland = entry.getKey();


            caseIndex += m + 1; //Go to next case
        }
    }

    private class Edge implements Comparable<Edge>{
        private Point2D.Double point1;
        private Point2D.Double point2;
        double distance;

        Edge(Point2D.Double point1, Point2D.Double point2){
            this.point1 = point1;
            this.point2 = point2;
            setDistance();
        }

        private double getDistance(){
            return distance;
        }

        private void setDistance() {
            this.distance = point1.distance(point2);
        }

        @Override
        public int compareTo(Edge o) {
            return Double.compare(getDistance(), o.getDistance());
        }
    }
}
