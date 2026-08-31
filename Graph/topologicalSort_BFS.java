package Graph;
import java.util.*;
public class topologicalSort_BFS {
      public static class Edge {
        int src;
        int des;

        Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    public static void createGraph(  ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void inDeg(ArrayList<Edge>[] graph, int[] inDeg){
          for(int i = 0; i<graph.length; i++){ //i = vertex
              for(int j = 0; j<graph[i].size(); j++){
                  Edge e = graph[i].get(j);
                  inDeg[e.des]++;
              }
          }
    }
    public static void topSort(ArrayList<Edge>[] graph){
          int[] inDeg = new int[graph.length];
inDeg(graph,inDeg);
          Queue<Integer> q = new LinkedList<>();
          for(int i = 0; i<inDeg.length; i++){
            if(inDeg[i] == 0){
                q.add(i);
            }
          }
          while(!q.isEmpty()){
              int curr = q.remove();
              System.out.print(curr + " ");

              for(int i = 0; i<graph[curr].size(); i++){
                  Edge e = graph[curr].get(i);
                  inDeg[e.des]--;

                  if(inDeg[e.des] == 0){
                      q.add(e.des);
                  }
              }
          }
    }
    public static void main(String[]args){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topSort(graph);
    }
}
