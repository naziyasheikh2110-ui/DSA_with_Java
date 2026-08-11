package BinaryTree;

import java.util.*;

public class BuildingBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + ",");
                return;
            }
            System.out.print(root.data + ",");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void LevelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                        System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int heightOfTree(Node root){
            if(root == null){
                return 0;
            }
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
           return Math.max(lh ,rh)+1;
        }

        public static int countNode(Node root){
            if(root == null){
                return 0;
            }
            int lc = countNode(root.left);
            int rc = countNode(root.right);
            return lc+rc+1;
        }
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int RightSum = sumOfNodes(root.right);
            return leftSum+RightSum+root.data;
        }
    }


    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
//        System.out.println(root.data);

//           tree.preOrder(root);
//           tree.inOrder(root);
//           tree.postOrder(root);
//        tree.LevelOrder(root);

//        System.out.println( tree.heightOfTree(root));
//        System.out.println(tree.countNode(root));
        System.out.println(tree.sumOfNodes(root));

    }
}
