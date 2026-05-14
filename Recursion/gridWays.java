package Recursion;

public class gridWays {
    public static int grid_ways(int i, int j, int n , int m){
        if(i==n-1 && j==m-1){   // base case condition for last cell
            return 1;
        } else if (i == n || j == m) { //if the i and j goes out of the grid
            return 0;
        }
        int w1 = grid_ways(i+1, j, n,m);
        int w2 = grid_ways(i, j+1, n,m);

        return w1 + w2;

    }
    public static void main(String[] args){
        int n = 4 , m = 4;
        System.out.println(grid_ways(0 , 0 , n, m));

        //TC - O(2^n+m)
    }
}
