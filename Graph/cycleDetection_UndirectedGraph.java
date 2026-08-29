package Graph;

import java.util.*;
public class cycleDetection_UndirectedGraph {
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
        graph[0].add(new Edge(0,3));

        //1 vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        //2 vertex
//        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,4));

        //3 vertex
        graph[3].add(new Edge(3,0));


        //4 vertex
        graph[4].add(new Edge(4,2));

    }

    public static boolean detectCycle(ArrayList<Edge> graph[]){ //O(V+E)
         boolean[] visit = new boolean[graph.length];

         for(int i = 0; i< graph.length; i++){
             if(!visit[i]){
                 if(detectCycleUtil(graph, visit, i, -1)){
                     return true;
                 }

             }
         }
         return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean[]visit, int curr, int par){
         visit[curr] = true;

         for(int i =0; i<graph[curr].size();i++){
             Edge e = graph[curr].get(i);
             //case-2
             if(!visit[e.des]){
                if(detectCycleUtil(graph,visit, e.des, curr)){
                    return true;
                }
             }//case-1
             else if (visit[e.des] && e.des != par) {
                 return true;
             }
            //case 3- visited bhi hai or parent bhi hai -> eat five star do nothing
         }
         return false;
    }
    public static void main(String[]args){

         /*          0 ------3
                   /   |
                 1     |
                  \   |
                     2 ------4


          */

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);


        System.out.println(detectCycle(graph));
    }
}
