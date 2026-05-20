package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
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
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for(int i=0;i<size-2; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        size--;
        tail = temp;
        return val;
    }

    //Iterative search for key
    public int iterativeSearch(int key){
        int i = 0;
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                System.out.println("key " + key + " found at index "+ i);
                return key;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        System.out.println("Key not found");
        return -1;
    }

    //Recursive Search for the key
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
       int idx =helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //recursive reverseReverse the LL
    public void recReverse(Node head){
        if(head == null){
            return;
        }
        recReverse(head.next);
        System.out.print(head.data + "->");
    }
    //Iterative reverse
    public void itrativeRev(){
        Node prev = null;
        Node curr =tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if(sz==n){
            head = head.next;
            return;
        }
        Node prev = head;
        int i =1;
        int iToFind = sz-n;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //check if ll is palindrome
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }
    public boolean isPalindrome(){
        if(head == null && head.next== null){
            return true;
        }
        //step 1 - find mid
        Node midNode = findMid(head);
        //step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //Right head
        Node left = head;
        //step 3 compare both halves
        while(right!=null){
            if(left.data != right.data ){
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;
    }

    public static void main (String[] args){
        LinkedList ll = new LinkedList();
//        ll.print();

        ll.addFirst(2);  // idx - 1
        ll.addFirst(1);  // idx - 0
        ll.addLast(3);  //  idx - 2
        ll.addLast(2);  //  idx - 3

        ll.add(4,1); //idx - 4

        ll.print(); //1->2->3->1->2
//        ll.iterativeSearch(4);
//        ll.iterativeSearch(49);

//        System.out.println(ll.recSearch(3));
//        System.out.println("Size of the Linked list is " + ll.size); // 5
//
//        ll.removeFirst();
//        ll.print(); // 2->3->4->5
//
//        ll.removeLast();
//        ll.print();

//        ll.recReverse(head);
//        ll.itrativeRev();
//        ll.print();

//        ll.deleteNthFromEnd(3);
//        ll.print();

        System.out.println(ll.isPalindrome());
    }
}
