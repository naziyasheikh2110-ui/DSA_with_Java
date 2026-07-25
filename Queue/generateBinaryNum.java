package Queue;

import java.util.*;
public class generateBinaryNum {
    static void binaryNum(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-->0){

        String s1 = q.peek();
        System.out.println(s1);
        q.remove();
        String s2 = s1;
        q.add(s2 + "0");
        q.add(s2 + "1");
        }
    }

    public static void main (String[]args){
        binaryNum(10);
    }
}
