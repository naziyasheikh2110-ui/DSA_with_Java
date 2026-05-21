package LinkedList;

public class LinkedListP2 {
    public static class Node {
        int data;
        LinkedListP2.Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedListP2.Node head;
    public static LinkedListP2.Node tail;
    public static int size;

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
return false;
    }

    public static  void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle
        prev.next = null;

    }
    public static void main (String[]args){
       head = new Node(1);
       Node temp = new Node(2);
       head.next = temp;
       head.next.next = new Node(3);
       head.next.next.next = temp;
       //1->2->3->2  3 pointing toward 2 isCycle = true
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
}
