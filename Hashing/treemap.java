package Hashing;

import java.util.TreeMap;

public class treemap {
    public static void main(String[]args){

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("india", 100);
        tm.put("China", 50);
        tm.put("us", 450);
        tm.put("pak", 580);

        System.out.println(tm);
    }
}
