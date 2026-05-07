package Recursion;
import java.util.*;

public class RecursionBasicsP2 {

    public static int tilingProblem(int n){  //floor size - 2 X n
        if (n == 0 || n == 1) {
            return 1;
        }
//        //vertical align
//        int fnm1 = tilingProblem(n-1);
//
//        //horizontal align
//        int fnm2 = tilingProblem(n-2);
//
//        int totalWays = fnm1 + fnm2;
        return tilingProblem(n-1 + tilingProblem(n+2));
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[] ){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicates(str, idx+1, newStr,map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar),map);
        }
    }

    public static int friendsParing(int n){  //O(2^n)
        if(n==1 || n==2){
            return n;
        }
        return friendsParing(n-1) + (n-1) * friendsParing(n-2);
    }

    public static void printBinaryString(int n, int lastPlace,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinaryString(n-1, 1, str+"1");
        }
    }

    public static void printAllOccurrence(int arr[],int i, int key){
        if(i== arr.length){
            return ;
        }
        if(arr[i]==key){
            System.out.print(i + " ");
        }
            printAllOccurrence(arr, i+1, key);
    }

    public static void numToLetters(String digits[],  int num){
        if(num==0){
            return;
        }
      int  lastDigit = (num%10);
        numToLetters(digits, num/10);
        System.out.print(digits[lastDigit]+ " ");
    }

    public static int stringLength(String str){
        if(str.length() == 0){
            return 0;
        }
        return stringLength(str.substring(1)) + 1;
    }

    public static void towerOfHanoi(int n,char src, char helper, char des){
        if(n==1){
            System.out.println("Move disc " + n + " from " + src + " to " + des);
            return;
        }
        towerOfHanoi(n-1, src, des ,helper );
        System.out.println("Move disc " + n + " from " + src + " to " + des);

        towerOfHanoi(n-1, helper, src, des);
    }
    public static void main(String[]args){
//        System.out.println(tilingProblem(4));

          String str = "naazziiya";
//        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

//        System.out.println(friendsParing(3));

//        printBinaryString(3,0,"");

//          int arr[] = {3,2,4,5,2,7,2,2};
//          printAllOccurrence(arr,0,2);

//          String[] digits = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//          numToLetters(digits,2019 );

//        System.out.println(stringLength(str));

        towerOfHanoi(2,'A' , 'B' , 'C');

    }

}
