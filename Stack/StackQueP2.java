package Stack;

import java.util.Stack;

public class StackQueP2 {
    public static boolean isValidParentheses(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '{' || ch=='(' || ch=='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
               else if((s.peek() == '{' && ch == '}')
                      || (s.peek() == '(' && ch == ')')
                      || (s.peek() == '[' && ch == ']') ) {
                   s.pop();
                }else{
                   return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else return false;
    }

    public static boolean duplicateParen(String str){
     Stack<Character> s = new Stack<>();
      for(int i =0;i<str.length();i++){
          char ch = str.charAt(i);
          int count =0;
          if(ch==')'){
              while(s.peek()!='('){
                  s.pop();
                  count++;
              }if(count<1){
                  return true; //duplicate found
              }else{
                  s.pop(); //opening pair
              }
          }else{
              s.push(ch);
          }
      }
      return false;
    }

    public static void maxArea(int[]arr){
       int maxArea = 0;
        int[] nse = new int[arr.length];
        int[] pse = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        //for next smaller element
        for(int i = arr.length-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                 nse[i]= arr.length;
            }
            else{
               nse[i]  = s.peek();
            }
            s.push(i);
        }

        //for prev smaller el
        s = new Stack<>(); // stack ko empty kiya
        for(int i = 0; i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                 pse[i]= -1;
            }
            else{
               pse[i]  = s.peek();
            }
            s.push(i);
        }

        //current area
        for(int i = 0; i<arr.length; i++){
            int height = arr[i];
            int width = nse[i]-pse[i]-1;
            int currArea = height*width;

            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max area " + maxArea);
    }
    public static void main (String[]args){
//        String str = "{([]}";
//        System.out.println(isValidParentheses(str));

//        String str = "(((a+b))+(c+d))";
//        String str1 = "(a+b)";
//        System.out.println(duplicateParen(str));
//        System.out.println(duplicateParen(str1));

        int[]arr = {2,1,5,6,2,3};
        maxArea(arr);


    }
}
