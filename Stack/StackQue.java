package Stack;

import java.util.Stack;

public class StackQue {
    public static void pushAtBottom(Stack<Integer> st, int data){
       if(st.isEmpty()){
           st.push(data);
           return;
       }
       int top = st.pop();
       pushAtBottom(st, data);
       st.push(top);
    }
// ---------------------------------------------------------
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i<str.length()){
        s.push(str.charAt(i));
                i++;
        }
        StringBuilder res = new StringBuilder(" ");
        while (!s.isEmpty()){
           char curr = s.pop() ;
            res.append(curr);
        }
        return res.toString();
    }
//    ----------------------------------------------------------
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
          return;
         }
       int top = st.pop();
        reverseStack(st);
        pushAtBottom(st, top);
    }
//    -----------------------------------------------------------
public static void stockSpan(int[] stocks, int span[]) {
    Stack<Integer> st = new Stack<>();
    span[0] = 1;
    st.push(0);

    for (int i = 1; i < stocks.length; i++) {
        int currPrice = stocks[i];
        while (!st.isEmpty() && currPrice > stocks[st.peek()]) {
            st.pop();
        }
        if (st.isEmpty()) {
            span[i] = i + 1;
        } else {
            int prevHeight = st.peek();
            span[i] = i - prevHeight;
        }
        st.push(i);
    }
}

public static void nextGreaterEl(int[]arr, int[] nextGreater){
      Stack<Integer> s = new Stack<>();
      for(int i = arr.length-1; i>=0; i--){

          while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
              s.pop();
          }
          if(s.isEmpty()){
             nextGreater[i] = -1;
          }
          else{
              nextGreater[i] = arr[s.peek()];
          }
          s.push(i);
      }
}
    public static void main (String[]args){
//        Stack<Integer> st = new Stack<>();
//        st.push(3);
//        st.push(2);
//        st.push(1);
//        System.out.println(st);

//        pushAtBottom(st, 4);
//        while(!st.isEmpty()){
//            System.out.println(st.pop());
//        }
//     -------------------------------

//        System.out.println(reverseStr("abcd"));
//
//     ----------------------------
//        reverseStack(st);
//        System.out.println(st);

//    --------------------------------
//
//        int[] stocks = {100,80,60,70,85,100};
//        int[] span = new int[stocks.length];
//        stockSpan(stocks,span);
//
//        for(int i = 0; i<span.length; i++){
//            System.out.println(span[i]);
//        }

//        --------------------------------------
        int[] arr = {6,8,0,1,3};
        int[] nextGreater = new int[arr.length];

        nextGreaterEl(arr, nextGreater);
        for(int i = 0;i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }




















    }
}
