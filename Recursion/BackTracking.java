package Recursion;

public class BackTracking {

    public static void changeArr(int[]arr, int i , int val){
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        //backtracking
        arr[i] = arr[i]-2;
    }

    public static void printArr(int[] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void subSets(String str,int i, String ans ){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        // yes choice
        subSets(str, i+1 , ans+str.charAt(i));
        //no choice
        subSets(str, i+1, ans);
    }

    public static void findPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1, str.length());
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main (String[]args){
//        int[] arr = new int[5];
//       changeArr(arr, 0, 1);
//       printArr(arr);

       String str = "abc";
//       subSets(str, 0, "");

        findPermutation(str, "");


    }
}
