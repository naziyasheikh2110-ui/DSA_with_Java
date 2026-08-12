package BinaryTree;

public class MaximumPathSum {
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
     static  int MaxPath = Integer.MIN_VALUE;
   public static int maxPathSum(Node root){
        MaxPath = Integer.MIN_VALUE;
        Path(root);
        return MaxPath;
   }
   public static int Path(Node root){
       if(root == null){
           return 0;
       }
       int left = Math.max(0, Path(root.left));
       int right = Math.max(0, Path(root.right));

       int currSum = root.data + left + right;
       MaxPath = Math.max(MaxPath , currSum );


       return root.data + Math.max(left, right);
   }
    public static void main(String[]args){
        Node root = new Node(-10);
        root.left =  new Node(9);
        root.right =  new Node(20);
        root.right.left =  new Node(15);
        root.right.right =  new Node(7);

        System.out.println(maxPathSum(root));
    }
}
