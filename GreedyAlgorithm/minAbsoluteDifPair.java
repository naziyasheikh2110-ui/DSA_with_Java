package GreedyAlgorithm;
import java.util.*;

public class minAbsoluteDifPair {
    public static void main (String[]args){
        int[] A = {4,3,1};
        int[] B = {5,8,9};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i=0;i< A.length; i++){
            int dif = Math.abs(A[i] - B[i]);
            minDiff+=dif;
        }
        System.out.println(minDiff);
    }
}
