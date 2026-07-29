package Queue;
import java.util.*;
public class queueReversal {
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
           q.add(s.pop());
        }
    }

    public static void main (String[]args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // 1 2 3 4 5
        //rev - 5 4 3 2 1

        reverseQueue(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
