package GreedyAlgorithm;
import java.util.*;
public class jobSequencing {
   static class Job{
       int id;
       int profit;
       int deadline;

       public  Job(int i, int d, int p){
           this.id = i;
           this.profit = p;
           this.deadline = d;
       }
   }

    public static void main(String[]args){
        int[][] jobInfo = {{4,20}, {1,10}, {1,40}, {1,30}};

        ArrayList<Job>jobs = new ArrayList<>(); //Arraylist of object

        for(int i=0; i<jobInfo.length;i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1] ));
        }
        Collections.sort(jobs, (obj1 , obj2)->obj2.profit-obj1.profit); //decending order

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i=0;i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if (curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        //printing
        System.out.println("Maximum jobs = " + seq.size() );
        for (int i=0;i<seq.size();i++){
            System.out.println(seq.get(i));
        }

    }
}
