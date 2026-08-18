package Heaps;

import java.util.LinkedList;
import java.util.Queue;

public class minimumTimeToFillSlots {
    public static void main(String[]args){
        int[] arr = {2,6};
        int K = 2;
        int N = 6;

        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[N+1];
        int time =0;

        for(int i =0; i<K; i++){
            q.add(arr[i]);
            visit[arr[i]] = true;
        }

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++){
                int curr = q.poll();
                if(curr-1>=1 && !visit[curr-1]){
                    visit[curr-1] = true;
                    q.add(curr-1);
                }
                if(curr+1<=N && !visit[curr+1]){
                    visit[curr+1] = true;
                    q.add(curr+1);
                }
            }
            time++;
        }

        System.out.print("Time taken to fill all the slots is " +( time-1) + " unit");
    }
}
