package Graph;

import java.util.*;
public class bipartiteGraph {
     public static class Edge{
        int src;
        int des;


        Edge(int s,int d){
            this.src = s;
            this.des = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        //0 vertex
        graph[0].add(new Edge(0,1));
//        graph[0].add(new Edge(0,2));

        //1 vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        //2 vertex
//        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        //3 vertex
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));


        //4 vertex
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));

    }

    public static boolean isBipartite(ArrayList<Edge> graph[]){
         int[] color = new int[graph.length];
         for(int i = 0; i<color.length; i++){
             color[i] = -1; // no color
         }

         Queue<Integer> q = new LinkedList<>();

         for(int i =0 ;i< graph.length; i++){
             if(color[i] == -1){ //BFS
                 q.add(i);
                 color[i] = 0; //yellow

                 while(!q.isEmpty()){
                     int curr = q.remove();

                     for(int j =0 ;j<graph[curr].size(); j++){
                         Edge e = graph[curr].get(j);

                         if(color[e.des]==-1){
                             int nextColor = color[curr] == 0 ? 1 : 0;
                             color[e.des] = nextColor;
                             q.add(e.des);
                         } else if (color[e.des] == color[curr]) {
                             return false;
                         }
                     }
                 }
             }
         }
     return true;
    }

//    -------------------method 2----------------------


    public static void main(String[]args){

       /*
                  0
               /    \
             1       2
             \       /
              3-----4
        */

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(isBipartite(graph));
    }
}
