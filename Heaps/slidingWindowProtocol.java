package Heaps;

import java.util.PriorityQueue;

public class slidingWindowProtocol {

    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val - this.val; //descending order me
        }
    }
    public static void main(String[]args){ //O(nlogK)
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k= 3;
        int[] res = new int[arr.length-k+1]; //=> 8-3+1 = 6 pairs will form

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i =0; i<k; i++){ //1st Window
            pq.add(new Pair(arr[i], i));
        }

       res[0] = pq.peek().val;  //maximum element of pq

        for(int i = k; i<arr.length; i++){
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        //print
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }

    }
}
