package BinarySearchTree;

import java.util.*;

public class TwoPairSum {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }
    public static void inorder(Node root, ArrayList<Integer> tree){
        if(root == null){
            return;
        }
        inorder(root.left , tree);
        tree.add(root.data);
        inorder(root.right, tree);

    }
    public static void GetPair(Node root1, Node root2 , int key){
        ArrayList<Integer> tree1 = new ArrayList<>();
        inorder(root1, tree1);
        ArrayList<Integer> tree2 = new ArrayList<>();
        inorder(root2, tree2);

        int i = 0;
        int j = tree2.size()-1;
        int pair = 0;
        while(i< tree1.size() && j >= 0){
         int pairSum = tree1.get(i) + tree2.get(j);

         if(pairSum > key){
             j--;
         }
         else if(pairSum < key){
             i++;
         }
         else {
             pair++;
             System.out.print ("(" + tree1.get(i) + "," + tree2.get(j) + ")" + " " );
             i++;
             j--;
         }
        }
            System.out.println();
        System.out.println("Total number of pairs are  " + pair);
    }
    public static void main(String[]args){
        /*         5
                 /  \
                3    7
               / \  / \
              2  4 6   8
                TREE 1
         */
          Node root1 = new Node(5);
        root1.left =  new Node(3);
        root1.left.left =  new Node(2);
        root1.left.right =  new Node(4);

        root1.right =  new Node(7);
        root1.right.left =  new Node(6);
        root1.right.right =  new Node(8);

        /*
                  10
                 /  \
                6    15
              /  \  /  \
              3  8 11  18
                TREE 2

         */

        Node root2 = new Node(10);
        root2.left =  new Node(6);
        root2.left.left =  new Node(3);
        root2.left.right =  new Node(8);

        root2.right =  new Node(15);
        root2.right.left =  new Node(11);
        root2.right.right =  new Node(18);

        GetPair(root1, root2, 13);
    }
}

