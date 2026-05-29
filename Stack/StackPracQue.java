package Stack;

import java.util.*;

public class StackPracQue {
    public static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

//    --------------------------------------------------------
    public static boolean isPalindrome(Node head){
        Stack<Character> s = new Stack<>();
        Node temp = head;
        while(temp!=null){
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
          char ch =  s.pop();

          if(temp.data != ch){
              return false;
          }
          temp = temp.next;
        }
        return true;
    }

//    ----------------------------------------------------------

    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(part);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String dir : s) {
            ans.append("/").append(dir);
        }
        return ans.length() == 0 ? "/" : ans.toString();
    }

//    ----------------------------------------------------------


    public static void main (String[]args){

//        Node head = new Node('A');
//        head.next = new Node('B');
//        head.next.next = new Node('C');
//        head.next.next.next = new Node('B');
//        head.next.next.next.next = new Node('A');
//
//        if(isPalindrome(head)== true){
//            System.out.println("Yes it is palindrome");
//        }else{
//            System.out.println("No it is not palindrome");
//        }

       String path = "/.../a/../b/c/../d/./";
        System.out.println(simplifyPath(path));









    }
}
