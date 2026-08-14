package BinarySearchTree;

import java.util.ArrayList;

public class BuildingBST {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
     if(root == null){
       root = new Node(val);
       return root;
     }

     if(root.data > val ){
         root.left = insert(root.left , val);
     }else{
         root.right = insert(root.right , val);
     }
     return root;
    }
    public static void inOrder(Node root){
        if(root == null ){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
//    ---------------SEARCH KEY----------------

    public static boolean SearchKey(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if (root.data > key) {
            return SearchKey(root.left, key);
        }
        else{
            return SearchKey(root.right,key);
        }
    }

//    ------------------ DELETE NODE-----------------
    public static Node Delete(Node root, int value){
        if(root.data > value){
            root.left = Delete(root.left , value);
        }
        else if(root.data<value){
            root.right = Delete(root.right , value);
        }else{
//             case 1 - no child
                if(root.left==null && root.right==null){
                   return null;
                }
//             case 2- one child
                else if(root.left == null){
                  return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }
//              case 3 - both child
               Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = Delete(root.right, value);
        }
          return root;
    }

    public static Node findInorderSuccessor(Node root){
while(root.left != null){
    root = root.left;
}
return root;
    }
//   ----------------------- PRINT IN RANGE -----------------------------
    public static void PrintInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            PrintInRange(root.left , k1 ,k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right , k1,k2);
        }else if(root.data<k1){
            PrintInRange(root.left, k1,k2);
        }else{
            PrintInRange(root.right, k1,k2);
        }
    }
//   -----------------PRINT ROOT TO LEAF NODE PATH ---------
public static void printPath(ArrayList<Integer> path){
        for(int i =0;i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
    System.out.println("Null");
}
public static void Root2NodePath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){ //leaf node
            printPath(path);
        }
        Root2NodePath(root.left, path);
        Root2NodePath(root.right, path);
        path.remove(path.size()-1); //removing last node - backtracking
}
//-----------------VALIDATE BINARY TREE----------------
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

//    ----------MIRROR BST------------
    public static Node mirror(Node root){
    if(root == null){
        return null;
    }
    Node leftMirror = mirror(root.left);
    Node rightMirror = mirror(root.right);

    root.left = rightMirror;
    root.right = leftMirror;
    return root;
    }
    public static void preorder(Node root){
        if(root ==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[]args){

        /*
                      8
                    /   \
                   5    10
                  / \    \
                 3   6    11
                / \        \
               1   4        14
          */



        int[] values = {8,5,10,3,6,1,4,11,14};
        Node root = null;

        for(int i = 0; i<values.length;i++){
            root = insert(root, values[i]);
        }
//        inOrder(root);
//        System.out.println();

//        System.out.println (SearchKey(root, 19) );

//        Delete(root, 10);
//        inOrder(root);

//        PrintInRange(root, 5,14);

//        Root2NodePath(root, new ArrayList<>());
//
//        if(isValidBST(root , null, null)){
//            System.out.println("BST is valid");
//        }else{
//            System.out.println("Not valid");
//        }

        mirror(root);
        preorder(root);

    }
}
