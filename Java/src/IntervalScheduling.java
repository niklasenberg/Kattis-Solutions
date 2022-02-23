/*
Implements EDF-scheduling via heap (greedy)
https://en.wikipedia.org/wiki/Earliest_deadline_first_scheduling
 */

import java.util.*;

public class IntervalScheduling {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        //Read input
        while(in.hasNext()){
            input.add(in.nextLine());
        }
        input.remove(0); //Remove n, not needed

        //Create all intervals from input and add heap
        Queue<Interval> intervals = new PriorityQueue<>();
        for(String line : input){
            String[] numbers = line.split(" ");
            intervals.add(new Interval(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])));
        }

        ArrayList<Interval> result = new ArrayList<>(); //Collect optimal schedule in list

        Interval current = intervals.poll(); //Get earliest ending interval from queue
        result.add(current); //Add it to optimal schedule

        while(!intervals.isEmpty()){ //As long as there are intervals left in the queue
            current = intervals.poll(); //Move on to the next earliest ending interval

            //If the earliest ending interval starts after the optimal schedules latest interval
            if(current.start >= result.get(result.size()-1).end){
                result.add(current); //Add it to the schedule
            }
        }

        System.out.println(result.size());

    }

    //Nested class representing an interval, implements Comparable to sort by end-time
    private static class Interval implements Comparable<Interval>{
        private final int start;
        private final int end;

        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Interval o) {
            return this.end - o.end;
        }
    }
}
