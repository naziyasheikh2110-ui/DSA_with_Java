package Hashing;

import java.util.HashMap;
import java.util.Set;

public class BasicOperations {
    public static void main (String[]args){

        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India" , 300);
        hm.put("china" , 140);
        hm.put("US" , 540);
        hm.put("nepal" , 140);
        hm.put("europe" , 5440);

        System.out.println("Complete hashMap -> " + hm);

        //get key - O(1)
        int population = hm.get("India");
        System.out.println("Population of entered Key -> " + population);

        //containsKey - O(1)
        if(hm.containsKey("china")){
            System.out.println("yes, given key exist");
        }


        //remove - O(1)
        int removedPop = hm.remove("US");
        System.out.println("Deleted population -> " + removedPop);

        System.out.println("Deleted population -> " + hm.remove("Asia"));

        //size
        System.out.println(hm.size());

        //is Empty
        System.out.println(hm.isEmpty());

        //clear hashMap
//        hm.clear();
//        System.out.println(hm.isEmpty());

        //Iterate
        //we can also use entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("Key = " + k + ", value = " + hm.get(k));
        }
    }
}
