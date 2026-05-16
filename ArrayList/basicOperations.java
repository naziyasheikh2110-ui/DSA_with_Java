package ArrayList;
import java.util.*;
public class basicOperations {
    public static void main (String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add element O(1)
           list1.add(1);
           list1.add(2);
           list1.add(3);
           list1.add(4);
           list1.add(5);
        list1.add(3,10); //-> it shift the element of that inx to next one
        System.out.println(list1);

        //Get element O(1)
       int el1 = list1.get(3);
        System.out.println(el1);

        //remove element O(n)
//        list1.remove(2);
//        System.out.println(list1);

        //set element O(n)
        list1.set(2, 11);
        System.out.println(list1); //-> it remove the element of that index

        //contain element O (n)
        System.out.println(list1.contains(4));
        System.out.println(list1.contains(12));

        //Size of arrayList

        System.out.println(list1.size());
        for(int i = 0;i< list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        //Reverse of array list


        System.out.println(list1.size());
        for(int i = list1.size()-1;i>=0; i--){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

    }
}
