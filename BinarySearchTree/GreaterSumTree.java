package BinarySearchTree;

public class GreaterSumTree {
     static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }
    static int sum = 0;
    public static void transform(Node root){
        if(root==null){
            return ;
        }
        transform(root.right);
        int temp = root.data;
        root.data = sum;
        sum+=temp;
        transform(root.left);

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static void main (String[]args){
         Node root = new Node(5);
        root.left =  new Node(3);
        root.left.left =  new Node(2);
        root.left.right =  new Node(4);

        root.right =  new Node(8);
        root.right.left =  new Node(6);
        root.right.right =  new Node(10);

        int sum = 0;
         transform(root);
         inorder(root);

    }
}
