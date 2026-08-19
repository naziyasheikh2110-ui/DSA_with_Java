package Heaps;

import java.util.*;
public class pqForObjects {
    static class student implements Comparable<student>{
        String name;
        int rank;

        student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main (String[]args){

        PriorityQueue<student> pq = new PriorityQueue<>();

        pq.add(new student ("A" , 5));
        pq.add(new student ("B" , 2));
        pq.add(new student ("C" , 8));
        pq.add(new student ("D" , 1));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); //O(1)
            pq.remove();
    }


}
    }
