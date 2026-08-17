package Heaps;

import java.util.PriorityQueue;

public class mergeK_SortedLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node mergeKLists(Node[] lists){
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.data - b.data);

        //add head of each LL
        for(int i =0; i< lists.length; i++){
            pq.add(lists[i]); //{1,2,3}
        }

        Node dummy =  new Node(-1); // dummy head of LL
        Node tail = dummy;  // dummy -> -1 <- tail  both pointing at -1;

        while(!pq.isEmpty()){ //hr head ko lenge or uski next value add karenge
            Node curr = pq.poll(); // curr = 1 and pq = {2,3}

            tail.next = curr ; // dummy ->  (-1) <- tail -> 1
            tail = tail.next;  //dummy (-1) -> tail ( 1)

            if(curr.next!=null){
                pq.add(curr.next);  //{2,3,4}
            }
        } return dummy.next; // 1 -> and so on
    }

    //to print the merged ll
    public static void print(Node head){
    while(head!=null){
        System.out.print(head.data + "->");
        head = head.next;
    }
        System.out.println("null");

    }
    public static void main(String[]args){
        // List 1 : 1 -> 4 -> 7
        Node a = new Node(1);
        a.next = new Node(4);
        a.next.next = new Node(7);

        // List 2 : 2 -> 5 -> 8
        Node b = new Node(2);
        b.next = new Node(5);
        b.next.next = new Node(8);

        // List 3 : 3 -> 6 -> 9
        Node c = new Node(3);
        c.next = new Node(6);
        c.next.next = new Node(9);

        Node[] lists = {a, b, c};

         Node ans = mergeKLists(lists);
         print(ans);
    }
}
