package GreedyAlgorithm;

import java.util.Arrays;

public class LexicographicallySmallestString {

    public static void main (String[]args){
        int N = 5, K = 73;

        char[] arr = new char[N];
        Arrays.fill(arr , 'a');
        int remainingSum = K-N;

        for(int i = N-1; i>=0;i--){
            if(remainingSum==0){
                break;
            }
            int add = Math.min(25 , remainingSum);
            arr[i] = (char)(arr[i]+add);
            remainingSum-=add;

        }
        System.out.println(new String(arr));
    }
}
