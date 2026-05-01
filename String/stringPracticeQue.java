package Strings;

import java.util.*;

public class stringPracticeQue {

    public static boolean isPalindrome(String str){  //O(n)
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String path){
        int x = 0 , y = 0;
        for(int i =0; i<path.length();i++){
          char dir = path.charAt(i);

          if(dir == 'N'){
              y++;
          }else if(dir == 'S'){
              y--;
          } if(dir == 'E'){
              x++;
          } else{
              x--;
          }
        }
        int X2 = x*x;
        int Y2= y*y;

        return (float) Math.sqrt(X2+Y2);
    }

    public static void largestStr(String[] fruits){
        String largest = fruits[0];
        for(int i =0;i< fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

    public static String toUpperCase(String s1){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(s1.charAt(0));
        sb.append(ch);

        for(int i =1;i<s1.length(); i++){
            if(s1.charAt(i) == ' ' && i<s1.length()-1){
                sb.append(s1.charAt(i));
                i++;
              sb.append(Character.toUpperCase(s1.charAt(i)));
            }
            else{
                sb.append((s1.charAt(i)));
            }
        }
        return sb.toString();
    }

    public static String compressString(String s2){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i <s2.length(); i++){
            Integer count = 1;
            while(i<s2.length()-1 && s2.charAt(i) == s2.charAt(i+1)){
                count++;
                i++;
            }
           sb.append(s2.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static int countLowcase(String str){
        int count = 0;
        for(int i=0;i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                count++;
            }
        }
        System.out.println("Number of vowels in the given string are : " +  count);
        return count;
    }

    public static void anagrams(String a1 , String a2 ){
     // coverting to lower case
        a1 = a1.toLowerCase();
        a2 = a2.toLowerCase();

     // Checking length
        if(a1.length() == a1.length()){

            //converting String to char Array
            char[] a1charArray = a1.toCharArray();
            char[] a2charArray = a2.toCharArray();

            //sorting the char of array
           Arrays.sort(a1charArray);
           Arrays.sort(a2charArray);

           //check if char of both arrays are same

            boolean result = Arrays.equals(a1charArray, a2charArray);

            if(result){
                System.out.println(a1 + " and " + a2 + " are anagrams to each other");
            }
            else {
                System.out.println(a1 + " and " + a2 + " are not anagrams to each other");
            }
        }
        //if length is not same
        else {
            System.out.println(a1 + " and " + a2 + " are not anagrams to each other");
        }



    }
    public static void main(String[] args){
        String str = "racecar";
        String path = "WNEENESENNN";
        String fruits[] = {"Apple" , "Mango", "Banana"};
        String s1 = "I like this very much";
        String s2 = "aaabbbcccddd";
        String a1 = "earth";
        String a2 = "heart";
//        System.out.println(isPalindrome(str));
//        System.out.println(shortestPath(path));
//        largestStr(fruits);
//        System.out.println(toUpperCase(s1));
//        System.out.println(compressString(s2));
//        countLowcase(str);
        anagrams(a1,a2);

    }

}
