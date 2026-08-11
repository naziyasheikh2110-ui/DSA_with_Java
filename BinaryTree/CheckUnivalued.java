package BinaryTree;

public class CheckUnivalued {
     public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isUnivalued(Node root){
         if(root == null){
             return true;
         }

         if(root.left!=null && root.left.data!=root.data){
             return false;
         }
         if(root.right!=null && root.right.data!=root.data){
             return false;
         }
         return isUnivalued(root.left) && isUnivalued(root.right);
    }
    public static void main (String[]args){
         Node root = new Node(2);
         root.left = new Node(2);
         root.right = new Node(2);
         root.left.left = new Node(2);
         root.left.right = new Node(2);


        System.out.println(isUnivalued(root));

    }
}
