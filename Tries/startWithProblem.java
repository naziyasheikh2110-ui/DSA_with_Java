package Tries;

public class startWithProblem {
    static class Node{
       Node[] children = new Node[26];
        boolean eow;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String prefix){
      Node curr = root;
      for(int i =0;i<prefix.length();i++){
          int idx = prefix.charAt(i) - 'a';
          if(curr.children[idx]==null){
              curr.children[idx] = new Node();
          }
          curr = curr.children[idx];
      }
      curr.eow = true;
    }

    public static boolean startWith(String word){
        Node curr = root;

        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[]args){
        String[] word = {"mango", "man", "woman", "app", "apple"};

        for(int i=0;i< word.length;i++){
            insert(word[i]);
        }

        String prefix1 = "app";
        String prefix2 = "cat";
        System.out.println(startWith(prefix1));
        System.out.println(startWith(prefix2));
    }
}
