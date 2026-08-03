package GreedyAlgorithm;

import java.util.*;
public class chocolaProblem {
    public static void main (String[]args){
        int m = 6, n =4;
        Integer[] costHor = {4,1,2};
        Integer[] costVer = {4,1,2,1,3};

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h=0 , v=0;
        int hp=1 ,vp =1;
        int cost =0;

        while(v<costVer.length && h<costHor.length){
            if(costHor[h]<= costVer[v]){ //vertical cut
                cost += (costVer[v]*hp);
                vp++;
                v++;
            }else{ //horzontal cut
                cost += (costHor[h]*vp);
                hp++;
                h++;
            }
        }
        //for lefovers
        while(v<costVer.length ){
            cost += (costVer[v]*hp);
            vp++;
            v++;
        }
        while(h<costHor.length){
            cost += (costHor[h]*vp);
            hp++;
            h++;
        }

        System.out.println("Minimum cost of breaking down the chocolate into single pieces is " + cost);
    }
}
