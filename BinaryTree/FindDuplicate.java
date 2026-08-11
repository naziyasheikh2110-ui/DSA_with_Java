package BinaryTree;

import java.util.*;

public class FindDuplicate {
    public static class Node {
       int data;
       Node left;
       Node right;

       Node(int data) {
           this.data = data;
           this.left = null;
           this.right = null;
       }
   }
     static HashMap<String, Integer> map = new HashMap<>();
    static ArrayList<Node> ans = new ArrayList<>();

   public static ArrayList<Node> Duplicate(Node root){

       serialize(root);
       return ans;
   }
    public static String serialize(Node root){
        if(root == null){
            return "#";
        }
        String str = root.data + "," + serialize(root.left) + "," + serialize(root.right);

        int freq = map.getOrDefault(str , 0);

        if(freq == 1){
            ans.add(root);
        }
        map.put(str, freq +1);

        return str;
    }

    public static void main (String[]args){


        /*
              1
             / \
            4   3
           /   / \
          3   4   3
             /
            3
       */


        Node root = new Node(1);
         root.left =  new Node(4);
        root.right =  new Node(3);
        root.left.left = new Node(3);
        root.right.left =  new Node(4);
        root.right.right =  new Node(3);
        root.right.left.left = new Node(3);

       ArrayList<Node> list =  Duplicate(root);

       for(Node node : list) {
           System.out.println(node.data);
       }


    }
}
