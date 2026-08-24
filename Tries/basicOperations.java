package Tries;

public class basicOperations {
    static class Node{
        Node[] children = new Node[26];
        boolean eow; //End Of Word

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
        static Node root = new Node();

    public static void insert(String words){ //O(L)
        Node curr = root;
        for(int level = 0; level<words.length(); level++ ){
            int idx = words.charAt(level) - 'a'; //idx number mil jayega
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){ //O(L)
        Node curr = root;
        for(int level = 0; level<key.length(); level++ ){
            int idx = key.charAt(level) - 'a'; //idx number mil jayega
            if(curr.children[idx] == null){
               return false;
            }
            curr = curr.children[idx];
        }
       return curr.eow;
    }

    public static boolean wordBreak(String key){ //O(L)
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0,i))&& wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};

        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }
//
//            System.out.println(search("thee"));
//            System.out.println(search("cat"));

        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
