package Hashing;

import java.util.*;

public class bottomViewInBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    static class Info{
        int hd; //horizontal distance
        Node node;

        Info(int hd, Node node){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void bottomView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        q.add(new Info(0, root));


        while(!q.isEmpty()){
            Info curr = q.remove();
            map.put(curr.hd, curr.node);

            if(curr.node.left != null){
                q.add(new Info(curr.hd-1,curr.node.left ));
            }
            if(curr.node.right != null){
                q.add(new Info(curr.hd+1,curr.node.right ));
            }

        }
        for(Node node : map.values()){
            System.out.println(node.data + " ");
        }

    }
    public static void main (String[]args){

        /*       20
               /    \
              8     22
            /   \     \
           5     3    25
                / \
              10  14

              output -> 5, 10, 3, 14, 25

               */
        Node root = new Node(20);

        root.left = new Node(8);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        root.right = new Node(22);
        root.right.right = new Node(25);


        bottomView(root);

    }
}
