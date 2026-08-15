package BinarySearchTree;

public class KthSmallestElement {
      static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }
    public static int count =0;
    public static int ans =-1;
      public static void smallestElement(Node root , int k){
          if(root == null || ans != -1){
              return;
          }
          smallestElement(root.left, k);
          count++;
          if(k==count){
             ans = root.data;
              return;
          }
          smallestElement(root.right, k);
      }
    public static void main(String[]args){
  Node root = new Node(8);
             root.left = new Node(5);
             root.left.left = new Node(3);
             root.left.right = new Node(6);

             root.right = new Node(11);
             root.right.right = new Node(20);

             count = 0;
             ans = -1;

             smallestElement(root, 3);

        System.out.println(ans);
    }
}
