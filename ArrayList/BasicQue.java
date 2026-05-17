package ArrayList;

import java.util.*;
public class BasicQue {
    public static void swap(ArrayList<Integer> list,int idx1 , int idx2) {

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2 , temp);
    }

    public static void main(String[]args){
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(3);
//        list.add(9);
//        list.add(4);
//        list.add(5);
//
//        //find Maximum number TC- O(n)
//        int max = Integer.MIN_VALUE;
//        for(int i =0; i< list.size(); i++){
////            if(max<list.get(i)){
////                max = list.get(i);
//            max = Math.max(max,list.get(i));
//            }
////        }
//            System.out.println("Maximum element = " + max);
//
//        //Swap 2 numbers
//        System.out.println("Original ArrayList -> " + list );
//        swap(list, 1,3);
//        System.out.println("Swapped ArrayList -> " + list);
//
//        //sorting of list
//        System.out.println(list);
//
//         Collections.sort(list);
//        System.out.println("Ascending order -> " + list);
//
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println("Descending order -> " + list);

     //2D array
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        System.out.println(mainList);

        for(int i =0;i<mainList.size(); i++){
         ArrayList<Integer> currList = mainList.get(i);
         for(int j =0; j<currList.size(); j++){
             System.out.print(currList.get(j) + " ");
         }
        System.out.println();
        }

    }
}

