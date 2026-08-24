package Tries;

public class countUniqueSubstring {
    static class Node{
       Node[] children = new Node[26];
       boolean eow;

       Node(){
         for(int i = 0; i<26; i++){
             children[i] = null;
         }
       }
    }
    public static Node root = new Node();

    public static void insert(String str){
        Node curr = root;

        for(int i = 0; i< str.length(); i++){
            int idx = str.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static int countNode(Node root){ // num of nodes in suffix = substring of str
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i<26; i++){
            if(root.children[i] != null){
                count+= countNode(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[]args){
        String str = "ababa";

        //finding suffix of str
        for(int i = 0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNode(root));


    }
}
