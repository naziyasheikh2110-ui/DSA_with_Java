package Queue;

import java.util.*;
public class RopesWithMinCost {

    static int minCost(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
        }
        int cost = 0;
        while(pq.size()>1){
          int rope1 = pq.poll();
          int rope2 = pq.poll();

          int newRope = rope1+rope2;
          cost+=newRope;
          pq.offer(newRope);
        }
        return cost;
    }
    public static void main (String[]args){
        int arr[] = {2,4,8,3};
        System.out.println( minCost(arr));
    }
}
