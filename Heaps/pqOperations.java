package Heaps;

import java.util.PriorityQueue;

public class pqOperations {
    public static void main(String[]args){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3); //O(log n)
        pq.add(9);
        pq.add(5);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.print(pq.peek() +  " "); //O(1)
            pq.remove(); //O(log n)
        }
    }
}
