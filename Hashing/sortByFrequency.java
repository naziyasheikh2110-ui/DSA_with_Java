package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sortByFrequency {
    public static void main (String[]args){
        String str = "tree";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i) , 0) + 1);
        }

        //max heap - based on frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a,b) -> b.getValue() - a.getValue());

        //add all map entities to PQ
        pq.addAll(map.entrySet());

        //building ans
        StringBuilder ans = new StringBuilder();

        while(!pq.isEmpty()){

            Map.Entry<Character, Integer> entry = pq.poll(); //pair me nikalenge

            char ch = entry.getKey();
            int freq = entry.getValue();
            
            for(int i = 0; i<freq; i++){
                ans.append(ch);
            }
        }
        System.out.println(ans);

    }
}
