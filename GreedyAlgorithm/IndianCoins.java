package GreedyAlgorithm;

import java.util.*;

public class IndianCoins {
    public static void main (String[]args){
        int[] coin = {1,2,5,10,20,50,100,500,2000};
        int  V = 590;

//        Arrays.sort(coin); // if sort nahi hai to ese kro otherwise no need

        int val = V;
        int minCoin = 0;

        for(int i=coin.length-1; i>=0;i--){
            while(coin[i]<=val ){
                minCoin++;
                val-=coin[i];
            }
        }
        System.out.println("Minimum coins to make change for a value = " + minCoin);

    }
}
