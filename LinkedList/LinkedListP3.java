package LinkedList;

public class LinkedListP3 {
    public static class Node {
        int data;
        LinkedListP3.Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static LinkedListP3.Node head;
    public static LinkedListP3.Node tail;
    public static int size;

    public void addFirst(int data){
        //step 1
       Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2
        newNode.next = head;
        //step 3
        head = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LL does not exist");
        }
       Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //MERGE SORT ON LL
    public Node midNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find midNode
        Node mid = midNode(head);
        //call merge sort for left and right
       Node rightHead = mid.next;
       mid.next = null;

         Node newLeft =  mergeSort(head);
         Node newRight =  mergeSort(rightHead);

        //merge
      return  merge(newLeft, newRight);

    }
    public Node merge(Node head1, Node head2){
    Node mergeLl = new Node(-1);
    Node temp = mergeLl;

    while(head1!=null && head2!=null ){
        if(head1.data<=head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }  else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLl.next;
    }

    //ZIG_ZAG LINKED LIST
    public void zigZagLL(){
        //find mid
        Node mid = midNode(head);
        //revesrse second half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //alternate merging
        Node LH = head;
        Node RH = prev;
        Node nextL , nextR;

        while(LH!=null && RH != null){
          nextL = LH.next;
          LH.next = RH;
          nextR = RH.next;
          RH.next = nextL;

          LH = nextL;
          RH = nextR;
        }
    }
    public static void main(String[]args){
        //create
        LinkedListP3 ll = new LinkedListP3();
        //add
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1
        ll.print();

//        ll.head =  ll.mergeSort(ll.head);
//        ll.print();

        ll.zigZagLL();
        ll.print();
    }
}
