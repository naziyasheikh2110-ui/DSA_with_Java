package Heaps;

import java.util.PriorityQueue;

public class pathWithMinimumEffort{

    static class Path implements Comparable<Path>{
        int cost;
        int x, y;

        Path(int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost ;
        }
        @Override
        public int compareTo(Path p2){
            return this.cost - p2.cost; //Min heap
        }
    }
    public static int minPath(int[][]grid){
     int n = grid.length;
     int m = grid.length;

     int[][] dist = new int[n][m];

     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             dist[i][j] = Integer.MAX_VALUE;
         }
    }
         PriorityQueue<Path> pq = new PriorityQueue<>();

         dist[0][0] = grid[0][0];
         pq.add(new Path(0 ,0 , grid[0][0]));

         int[] dx = {-1,1,0,0}; //-1 = up 1 =down
         int[] dy = {0,0,-1,1}; //-1 = right 1 = left

         while(!pq.isEmpty()){
             Path curr = pq.poll();

             int x = curr.x;
             int y = curr.y;

             for(int i=0;i<4; i++){
                 int nx = x + dx[i];
                 int ny = y + dy[i];

                 if(nx>=0 && ny>=0 && nx < n && ny < m){
                     int newCost = dist[x][y]+ grid[nx][ny];

                     if(newCost < dist[nx][ny]){
                         dist[nx][ny] = newCost;
                         pq.add(new Path(nx,ny,newCost));
                     }
                 }
             }
         }
         return dist[n-1][m-1];
     }
    public static void main (String[]args){
        int[][] grid = {
                {31, 100, 65, 12, 18},
                {10, 13, 47, 157, 6},
                {100, 113, 174, 11, 33},
                {88, 124, 41, 20, 140},
                {99, 32, 111, 41, 20}
        };
        System.out.println(minPath(grid));
    }
}
