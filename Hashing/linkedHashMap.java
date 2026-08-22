package Hashing;

import java.util.*;
public class linkedHashMap {
    public static void main(String[]args){

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        //Doubly LL is used

        lhm.put("india", 100);
        lhm.put("China", 50);
        lhm.put("us", 450);
        lhm.put("pak", 580);
        lhm.put("nepal", 5000);

        System.out.println(lhm);
    }
}
