package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class largestRegionInBooleanMatrix {
    public static int getRegion(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visit = new boolean[rows][cols];

        int regionSize = 1;
        int maxRegion = 0;

        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1 && !visit[i][j]) {
                    visit[i][j] = true;
                    q.add(new int[]{i, j});
                    while (!q.isEmpty()) {
                        int[] curr = q.remove();
                        int r = curr[0];
                        int c = curr[1];
                        for (int d = 0; d < 8; d++) {
                            int nr = r + dr[d];
                            int nc = c + dc[d];

                            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && matrix[nr][nc] == 1 && !visit[nr][nc]) {
                                regionSize++;
                                q.add(new int[]{nr, nc});
                                visit[nr][nc] = true;
                            }
                        }
                    }
                }
            }
        }
        maxRegion = Math.max(maxRegion,regionSize);
        return maxRegion;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 1, 1, 0},
                          {0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 1}};

        System.out.println(getRegion(matrix));
    }
}
