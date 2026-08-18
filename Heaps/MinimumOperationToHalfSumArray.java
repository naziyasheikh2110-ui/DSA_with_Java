package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumOperationToHalfSumArray{
    public static void main(String[]args){
        int [] arr = {1,5,8,19};

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        double sum = 0;

        for(int i = 0; i<arr.length;i++){
            pq.add((double)arr[i]);
            sum+=arr[i];
        }
        double halfSum = sum/2.0;
        int operationCount = 0;

        while(sum >= halfSum){
            double curr = pq.poll();
            double half = curr/2;

            sum = sum - curr + half;
            pq.add(half);

            operationCount++;
        }
        System.out.println("Total opeartion = " + operationCount);
    }
}
