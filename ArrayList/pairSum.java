package ArrayList;
import java.util.*;
public class pairSum {
    //SORTED ARRAYLIST
    //BRUTE FORCE - O(n^2)
//    public static boolean pairSum1(ArrayList<Integer> list, int target) {
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i) + list.get(j) == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //OPTIMISED PAIR SUM - Two pointer approach
    public static boolean pairSum1(ArrayList<Integer> list , int target){
        int si = 0; //left pointer
        int ei = list.size()-1; //right pointer
        while(si<ei){
        if(list.get(si)+list.get(ei) == target){
            return true;
        }
        else if(list.get(si) + list.get(ei) < target){
            si++;
        }
        else{
            ei--;
        }
        }
        return false;
    }

//    SORTED AND ROTATED ARRAYLIST

    public static boolean pairSum2(ArrayList<Integer> list2, int target){
        int bp = -1; // breaking point
        for(int i = 0; i<list2.size(); i++){
            if(list2.get(i) > list2.get(i+1)){ //breaking point
               bp = i;
               break;
            }
        }
        int si = bp+1; //smallest
        int ei = bp; //largest
        int n = list2.size();
        while(si!=ei){
            if(list2.get(si)+list2.get(ei) == target){
                return true;
            }
            else if(list2.get(si) + list2.get(ei) < target){
                si = (si+1) % n;
            }
            else{
                ei = (n+ei-1) % n;
            }
        }
        return false;
    }

    public static void main (String[] args){
        //SORTED ARRAY
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        int target = 5;
//
//        System.out.println(pairSum1(list, target));

        //SORTED AND ROTATED
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        int target2 = 16;
        System.out.println(pairSum2(list2, target2));


    }
}
