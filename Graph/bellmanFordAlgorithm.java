package Graph;

import java.util.*;
public class bellmanFordAlgorithm {
       public static class Edge{
        int src;
        int des;
        int wt;

        Edge(int s,int d, int wt){
            this.src = s;
            this.des = d;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src){ //O(V X E)
           int[] dist = new int[graph.length];
           for(int i = 0; i<dist.length; i++){
               if(i!=src){
                   dist[i] = Integer.MAX_VALUE;
               }
        }
           int V = graph.length;
           for(int i = 0; i<V-1; i++){
           //Edge nikalne k liye 2 loop chaalenge -> O(E)
               for(int j =0; j< graph.length; j++){
                   for(int k = 0;k<graph[j].size(); k++){
                       Edge e = graph[j].get(k);

                       if(dist[src]!=Integer.MAX_VALUE && dist[e.src]+e.wt < dist[e.des]){
                          dist[e.des]  = dist[e.src]+e.wt ;
                       }
                   }
               }
           }
           for(int i = 0; i<dist.length; i++){
               System.out.print(dist[i] + " ");
           }
    }
    public static void main(String[]args){

           int V = 5;
           ArrayList<Edge>[] graph = new ArrayList[V];

           createGraph(graph);

           bellmanFord(graph, 0);
    }
}
