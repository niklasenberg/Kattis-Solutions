//WORK IN PROGRESS

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class IslandHopping {
    public static void main(String[] args) throws IOException {
        ArrayList<String> input = new ArrayList<>();

//        Scanner in = new Scanner(System.in);
//
////        while(in.hasNext()){
////            input.add(in.nextLine());
////        }

        FileReader fileReader = new FileReader("/Users/niklasenberg/Desktop/islandinput.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        String line = reader.readLine();
        while(line != null){
            input.add(line);
            line = reader.readLine();
        }

        int n = Integer.parseInt(input.get(0));

        int caseIndex = 1;

        for(int i = 0; i < n; i++){ //Cases
            HashMap<Point2D.Double, Set<Edge>> points = new HashMap<>();
            int m = Integer.parseInt(input.get(caseIndex)); //Amount of islands for this case

            for(int k = 1; k <= m; k++){ //For each island
                String[] coordinates = input.get(caseIndex+k).split(" ");
                double x = Double.parseDouble(coordinates[0]);
                double y = Double.parseDouble(coordinates[1]);
                points.put(new Point2D.Double(x,y), new HashSet<>());
            }

            //TODO: Construct edges between points

            HashSet<Point2D.Double> mst = new HashSet<>(); //Construct initial MST

            //TODO: Fill MST and get distance

            caseIndex += m + 1; //Go to next case
        }
    }

    private class Edge{
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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return Double.compare(edge.distance, distance) == 0 && Objects.equals(point1, edge.point1) && Objects.equals(point2, edge.point2);
        }

        @Override
        public int hashCode() {
            return Objects.hash(point1, point2, distance);
        }
    }
}
