package Tries;

public class longestWordWithAllPrefix {
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
    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i = 0; i<26;i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a'); // ch ka index mil jaaye
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString(); // index ko string me convert kiya
                }

                longestWord(root.children[i], temp );
                temp.deleteCharAt(temp.length()-1); // backTrack
            }
        }
    }
    public static void main (String[]args){
        String[] word = {"a", "ap", "app", "appl", "apple", "apply", "banana"};

        for(int i = 0; i<word.length; i++){
            insert(word[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}
