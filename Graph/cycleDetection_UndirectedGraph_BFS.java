package Graph;

import java.util.*;
public class cycleDetection_UndirectedGraph_BFS {
      public static class Edge {
        int src;
        int des;


        Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        //0 vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0, 3));

        //1 vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        //2 vertex
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        //3 vertex
        graph[3].add(new Edge(3, 0));


        //4 vertex
        graph[4].add(new Edge(4, 2));

    }


    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] visit = new boolean[graph.length];
        int[] parent = new int[graph.length];

        Arrays.fill(parent, -1);  // pura array -1 se hogya fill

        for(int i = 0;i <graph.length; i++){
            if(!visit[i]){
                if(detectCycleUtil_BFS(graph, visit, parent, i)){
                    return true;
                }
            }
        }
        return false;
    }

  public static boolean detectCycleUtil_BFS(ArrayList<Edge>[] graph, boolean[] visit, int[] parent, int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visit[start] = true;

        while(!q.isEmpty()){
            int curr = q.remove();

            for(int i = 0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);

                if(!visit[e.des]) {
                    visit[e.des] = true;
                    parent[e.des] = curr;
                    q.add(e.des);
                } else if ( e.des != parent[curr]) {
                    return true;
                }
            }
        }
        return false;
  }


    public static void main (String[]args){
  int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);


        System.out.println(detectCycle( graph) ? "yes the given graph has cycle" : " No cycle");
    }
}
