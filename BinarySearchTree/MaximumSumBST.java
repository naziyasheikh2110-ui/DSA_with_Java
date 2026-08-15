package BinarySearchTree;

public class MaximumSumBST {
     static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }
    static class Info{
         boolean isBST;
         int min;
         int max;
         int sum;

         Info(boolean isBST, int min, int max, int sum){
             this.isBST = isBST;
             this.min = min;
             this.max = max;
             this.sum = sum;
         }
    }
    static int maxSum = Integer.MIN_VALUE;
    public static Info maximumSum(Node root){
         if(root == null){
             return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
         }
         Info leftInfo = maximumSum(root.left);
         Info rightInfo = maximumSum(root.right);

         int sum = leftInfo.sum + rightInfo.sum + root.data;

         int min = Math.min(root.data , Math.min(leftInfo.min , rightInfo.min));
         int max = Math.max(root.data , Math.max(leftInfo.max , rightInfo.max));

         if(!leftInfo.isBST || !rightInfo.isBST){
             return new Info(false, min, max, sum);
         }
         if(root.data <= leftInfo.max || root.data >= rightInfo.min){
             return new Info(false, min , max,sum);
         }
         if(leftInfo.isBST && rightInfo.isBST){
             maxSum = Math.max(maxSum , sum);
           return  new Info(true, min, max,sum);
         }
         return new Info(false, min,max,sum);
    }
     public static void main (String[]args){

        /*        5
                /   \
               9     2
              /       \
             6         3
           /  \
          8   7   */

             Node root = new Node(5);
             root.left = new Node(9);
             root.left.left = new Node(6);
             root.left.left.left = new Node(8);
             root.left.left.right = new Node(7);

             root.right = new Node(2);
             root.right.right = new Node(3);

           maximumSum(root);
         System.out.println("Maximum BST sum = " + maxSum);

     }
}
