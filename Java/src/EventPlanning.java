import java.util.Scanner;

public class EventPlanning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] firstLine = in.nextLine().split(" ");

        int people = Integer.parseInt(firstLine[0]);
        long budget = Long.parseLong(firstLine[1]);
        int hotels = Integer.parseInt(firstLine[2]);
        int weekends = Integer.parseInt(firstLine[3]);

        int minCost = Integer.MAX_VALUE;

        for(int i = 0; i < hotels; i++){
            int personCost = in.nextInt();
            for(int k = 0; k < weekends; k++){
                int availability = in.nextInt();
                if(availability >= people){
                    int weekendCost = personCost * people;
                    if(weekendCost <= budget && weekendCost < minCost){
                        minCost = weekendCost;
                    }
                }
            }
        }

        if(minCost != Integer.MAX_VALUE){
            System.out.println(minCost);
        }else{
            System.out.println("stay home");
        }
    }
}
