package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class timeTakenToRotOranges {

    public static int rottenOrange(int[][] grid) { //O(m x n) or O(n)^2
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;
//        saare rotten oranges Queue me add krdenge
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int time = 0;
//        up , down, left, right - directions
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] curr = q.remove();
                int r = curr[0];  //indices of 2 in Queue
                int c = curr[1];
                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d]; //new row and col
                    int nc = c + dc[d];

                    if(nr>=0 && nr < row && nc>=0 && nc<col && grid[nr][nc] ==1){
                          grid[nr][nc] = 2; // rotting from 1 -> 2
                          fresh--;

                          q.add(new int[]{nr,nc});
                    }
                }
            }
            time++;
        }
        if(fresh>0){
            return -1;
        }
        return time;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        int ans = rottenOrange(grid);

        if(ans == -1){
            System.out.println("Cannot rot all oranges");
        }else{
            System.out.println("Time taken to Rot oranges is " + ans + " minutes");
        }
    }
}
