package BinarySearchTree;

public class RangeSumOfBST {
         static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }
             public static int sum = 0;
    public static int rangeSum(Node root, int L,int R){
             if(root == null){
                 return 0 ;
             }
             if(root.data < L){
                return rangeSum(root.right ,L ,R);
             }
             if(root.data > R){
                 return rangeSum(root.left, L,R);
             }
             else{
                 sum+=root.data;

                 rangeSum(root.left, L,R);
                 rangeSum(root.right, L,R);
             }
      return sum;
    }
    public static void main(String[]args){
             Node root = new Node(8);
             root.left = new Node(5);
             root.left.left = new Node(3);
             root.left.right = new Node(6);

             root.right = new Node(11);
             root.right.right = new Node(20);

        System.out.println(rangeSum(root, 8,20));

    }
}
