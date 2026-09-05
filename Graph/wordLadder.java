package Graph;

import java.util.*;

public class wordLadder {
    public static boolean isAdjacent(String word1, String word2){
        int diff = 0;

        for(int i = 0;i<word1.length(); i++){
            if(word1.charAt(i)!= word2.charAt(i)){
                diff++;
            }
            if(diff>1){
                return false;
            }
        }
        return diff == 1; //true
    }
    public static int ladderLength(String start, String target, String[] dictionary){
        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        int length = 1;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i<size;i++){
                String curr = q.remove();

                if(curr == target){
                    return length;
                }

                for(String word: dictionary){
                    if(!visited.contains(word) && isAdjacent(curr, word)){
                        visited.add(word);
                        q.add(word);
                    }
                }
            }
            length++;
        }
        return -1;
    }
    public static void main(String[]args){
        String[] dictionary = {
                "POON",
                "PLEE",
                "SAME",
                "POIE",
                "PLEA",
                "PLIE",
                "POIN"
        };

        String start = "TOON";
        String target = "PLEA";

        System.out.println(ladderLength(start, target, dictionary));
    }
}
