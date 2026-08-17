package Heaps;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[]agrs){
        int[] streams = {10,20,11,70,50,40,100,5};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int x : streams){

            if(pq.size() < k){
                pq.add(x);
            }else if(pq.peek() < x){
                pq.remove();
                pq.add(x);
            }
                //print
                if(pq.size() < k){
                    System.out.print("_" + ", ") ;
                }else{
                    System.out.print(pq.peek() + ", ");
                }

        }
        System.out.println("...");
    }
}
