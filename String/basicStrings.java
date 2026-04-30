package Strings;

import java.util.*;

public class basicStrings {
    public static void printChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i = si; i<ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
//         char ch[] = {'a', 'b' , 'c' };
//         String str = "abcd";
//
//         //Taking input
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.next();            // -> Take only one word
//        name = sc.nextLine();        //- > take whole line
//        System.out.println(name);
//        System.out.println(name.length());

//        -> CONCATENATION
//        String firstName = "Naziya";
//        String lastName = "Bano";
//        String fullName = firstName + lastName;
//        System.out.println(fullName);
//
//        printChar(fullName);

//     -> COMPARISION
//        String s1 = "Tony";
//        String s2 = "Tony";
//        String s3 = new String("Tony");
//
//        System.out.println((s1 == s2) ? true : false);
//        System.out.println((s1 == s3) ? true : false); //-> false becoz new string is initiated
//        System.out.println(s1.equals(s3) ? true : false);

//     -> SUBSTRING
//        String str = "Hello World";
//        System.out.println(subString(str,0,5 ));
//        System.out.println(str.substring(0,5)); // inbuilt function

        //-> STRINGBUILDER

        StringBuilder sb = new StringBuilder(""); //TC- O(26)
        for(char ch = 'a'; ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);


    }
}
