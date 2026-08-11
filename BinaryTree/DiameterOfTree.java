package BinaryTree;

public class DiameterOfTree {
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

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        return Math.max(lh ,rh)+1;
    }
    public static int Diameter(Node root){ //O(n^2)
        if(root == null ){
            return 0;
        }
        int lDiameter = Diameter(root.left);
        int lh = heightOfTree(root.left);
        int RDiameter = Diameter(root.right);
        int rh = heightOfTree(root.right);

        int selfDiameter = lh + rh + 1;

        return Math.max(selfDiameter , Math.max(lDiameter , RDiameter));
    }
//    -------------------------------------------------------------------
    static class Info{ //)(n)
        int diam;
        int ht;
        Info(int diam ,int ht){
            this.diam = diam;
            this.ht = ht;
        }
        public static Info Diameter(Node root){
            if(root == null){
                return new Info(0,0);

            }
            Info leftInfo = Diameter(root.left);
            Info rightInfo = Diameter(root.right);

            int diam = Math.max((leftInfo.ht + rightInfo.ht+1) , Math.max(leftInfo.diam,rightInfo.diam));
            int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

            return new Info( diam, ht);
        }

    }
    public static void main(String[]args){
        /*
            1
          /  \
         2    3
       / \   / \
      4  5  6  7

         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

//        System.out.println( Diameter(root));

        System.out.println(Info.Diameter(root).diam);
    }
}
