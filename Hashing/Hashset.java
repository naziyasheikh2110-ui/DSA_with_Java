package Hashing;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Jaipur");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Delhi");
        cities.add("Gurgaon");

        System.out.println(cities);
//
//        if(cities.contains("Udaipur")){
//            System.out.println("yes it has udaipur");
//        } if(cities.contains("Delhi")){
//            System.out.println("yes it has Delhi");
//        }
//
//        cities.remove("Delhi");
//        System.out.println(cities.size());
//
//        cities.clear();
//        System.out.println(cities.isEmpty());

        //Iteration

        //method 1
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //method 2
        for(String city : cities){
            System.out.println(city);
        }

    }
}
