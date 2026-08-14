package BinarySearchTree;

public class closestElementInBST {
       static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }
    public static int minDiff = Integer.MAX_VALUE;
       public static int closest = -1;
       public static int closestElement(Node root, int K){
           if(root == null ){
               return closest;
           }
           int diff = Math.abs(root.data-K);

           if(diff < minDiff){
               minDiff = diff;
               closest = root.data;
           }
           if(K < root.data){
              return closestElement(root.left, K);
           }
           else if(K > root.data){
             return closestElement(root.right, K);
           }
           else{
           return closest;
           }
       }
    public static void main (String[]args){
          Node root = new Node(8);
             root.left = new Node(5);
             root.left.left = new Node(3);
             root.left.right = new Node(6);

             root.right = new Node(11);
             root.right.right = new Node(20);

        System.out.println(closestElement(root, 10));
    }
}
