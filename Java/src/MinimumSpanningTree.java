// Does not pass test 2
// Needs fibonacci heap or kruskal's mst algo to be efficient

import java.util.*;

public class MinimumSpanningTree {
    private HashMap<Integer, HashSet<Edge>> nodes = new HashMap<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        MinimumSpanningTree tree = new MinimumSpanningTree();
        tree.run();
    }

    private void run() {
        int nodeCount = in.nextInt();
        int edgeCount = in.nextInt();

        while(nodeCount != 0 || edgeCount != 0){
            clear();
            for(int i = 0; i < nodeCount; i++){
                add(i);
            }

            for(int i = 0; i < edgeCount; i++){
                int nodeOne = in.nextInt();
                int nodeTwo = in.nextInt();
                int weight = in.nextInt();

                connect(nodeOne,nodeTwo,weight);
            }

            MinimumSpanningTree mst = getMST();

            if(mst.nodes.keySet().size() < nodeCount){
                System.out.println("Impossible");
            }else{
                HashSet<Edge> edges = mst.getUniqueEdges();
                ArrayList<String> edgeList = new ArrayList<>();
                int sum = 0;
                for(Edge e : edges){
                    sum += e.weight;
                    edgeList.add(e.toString());
                }

                System.out.println(sum);

                Collections.sort(edgeList);
                for(String s : edgeList){
                    System.out.println(s);
                }
            }

            nodeCount = in.nextInt();
            edgeCount = in.nextInt();
            in.nextLine();
        }
    }

    private HashSet<Edge> getUniqueEdges() {
        HashSet<Edge> edges = new HashSet<>();
        for(HashSet<Edge> list : nodes.values()){
            edges.addAll(list);
        }
         return edges;
    }

    private void clear(){
        nodes = new HashMap<>();
    }

    private MinimumSpanningTree getMST() { //Prim's algo
        MinimumSpanningTree mst = new MinimumSpanningTree();
        HashSet<Integer> visited = new HashSet<>();
        HashSet<Edge> collected = new HashSet<>();
        PriorityQueue<Edge> edgeQueue = new PriorityQueue<>();


        Integer startNode = nodes.keySet().iterator().next();

        mst.add(startNode);
        visited.add(startNode);
        collected.addAll(nodes.get(startNode));
        edgeQueue.addAll(nodes.get(startNode));


        while(!edgeQueue.isEmpty()){
            Edge smallestEdge = edgeQueue.poll();


            int nextNode = smallestEdge.nodeTwo;
            int previousNode = smallestEdge.nodeOne;
            if(visited.contains(nextNode)){
                nextNode = smallestEdge.nodeOne;
                previousNode = smallestEdge.nodeTwo;
            }

            if(!visited.contains(nextNode)){
                visited.add(nextNode);
                mst.add(nextNode);
                mst.connect(nextNode, previousNode, smallestEdge.weight);

                for(Edge e : nodes.get(nextNode)){
                    if(!collected.contains(e)){
                        collected.add(e);
                        edgeQueue.add(e);
                    }
                }
            }
        }
        return mst;
    }

    private void add(int node){
        nodes.put(node, new HashSet<>());
    }

    public boolean connect(int first, int second, int cost) {
        if(nodes.containsKey(first) && nodes.containsKey(second)){
            Edge edge = new Edge(first, second, cost);
            nodes.get(first).add(edge);
            nodes.get(second).add(edge);
            return true;
        }
        return false;
    }

    private static class Edge implements Comparable<Edge>{
        int nodeOne;
        int nodeTwo;
        int weight;

        public Edge(int nodeOne, int nodeTwo, int weight) {
            this.nodeOne = nodeOne;
            this.nodeTwo = nodeTwo;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }

        @Override
        public String toString() {
            if(nodeOne < nodeTwo){
                return nodeOne + " " + nodeTwo;
            }
            return nodeTwo + " " + nodeOne;
        }
    }
}
