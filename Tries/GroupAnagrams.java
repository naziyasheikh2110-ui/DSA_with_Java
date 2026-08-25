package Tries;

import java.util.*;
public class GroupAnagrams {
    //method 1 -> Hashmap + Sorting -> O(n k logn)
//    public static List<List<String>> groupingAna(String[]strs){
//        HashMap<String, List<String>> map = new HashMap<>();
//
//        for(String str: strs){ //str = "tea"
//            char[]arr = str.toCharArray(); //['t', 'e', 'a']
//            Arrays.sort(arr); // ['a', 'e', 't']
//
//            String key = new String(arr); // "ate"
//
//            if(!map.containsKey(key)){
//                map.put(key,new  ArrayList<>()); //map => [["ate", [] ]]
//            }
//            map.get(key).add(str);       //map => map.get(key) -> key ki value do -> [] -> isme ham add krenge str -> ["tea"]
//        }
//        return new ArrayList<>(map.values());
//    }

    //method 2 -> Hashing + Frequency - No sorting -> O(n*k) -> Sorting ka logn bach gaya

    public static List<List<String>>  groupingAna(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] freq = new int[26];

            for(char ch: str.toCharArray()){
                freq[ch-'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int i=0;i<26; i++){
                key.append("#");
                key.append(freq[i]);
            }
            String k = key.toString();
        if(!map.containsKey(k)){
            map.put(k , new ArrayList<>());
        }
        map.get(k).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[]args){
        String[] strs = {"tea", "ate", "tan", "eat", "nat", "bat"};

        List<List<String>> result = groupingAna(strs);
        System.out.println(result);
    }
}
