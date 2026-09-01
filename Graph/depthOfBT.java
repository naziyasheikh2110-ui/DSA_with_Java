package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class depthOfBT {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int minDepth(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        int depth = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {

                Node curr = q.remove();

                if (curr.left == null && curr.right == null) {
                    return depth;
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
       depth++;

        }
return 0;
    }

    public static void main(String[] args) {
          /*
                 1
                / \
               8   2
              / \  /
             6   5 9
        */

        Node root = new Node(1);

        root.left = new Node(8);
        root.right = new Node(2);

        root.left.left = new Node(6);
        root.left.right = new Node(5);

        root.right.left = new Node(9);

        System.out.println(minDepth(root));
    }
}
