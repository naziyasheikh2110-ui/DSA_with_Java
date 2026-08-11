package BinaryTree;

public class DeleteLeafNode {
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
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

   public static Node DeleteNode(Node root, int x){
        if (root == null){
            return null;
        }
       root.left =  DeleteNode(root.left, x);
         root.right = DeleteNode(root.right, x);

        if(root.left == null && root.right == null && root.data == x){
            return null;
        }
        return root;

   }
    public static void main(String[]args){
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        int x = 3;
        DeleteNode(root, x);
        preOrder(root);
    }
}
