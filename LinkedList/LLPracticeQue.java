package LinkedList;

public class LLPracticeQue {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL does not exist");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ---------------------------------------------------------------------
    public Node getIntersectionNode(Node head1, Node head2) {
        Node p1 = head1;
        Node p2 = head2;

        while (p1 != p2) {
            if (p1 == null) {
                p1 = head2;
            } else {
                p1 = p1.next;
            }
            if (p2 == null) {
                p2 = head1;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }

    //----------------------------------------------------------------
    public void skipMdeleteN(Node head, int N, int M) {
        Node curr = head;
        while (curr != null) {
            //Skip M node
            for (int count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }
            Node temp = curr.next;

            //delete N node
            for (int count = 1; count <= N && temp != null; count++) {
                temp = temp.next;
            }
            curr.next = temp; //connection
            curr = temp; //move ahead
        }
    }

    //    -------------------------------------------------------
    public void swapNode(Node head, int x, int y) {
        if (x == y) {
            return;
        }
        //find X
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
        //find Y
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        //form connection
        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    //--------------------------------------------

    public void segregateOddEven() {
        Node prev = null;
        Node curr = head;
        Node end = head;
        //Move end to last node
        while (end.next != null) {
            end = end.next;
        }
        //initialize it as newEnd
        Node newEnd = end;
        //For odd
        while (curr.data % 2 != 0 && curr != end) {
            newEnd.next = curr;
            curr = curr.next;
            newEnd.next.next = null;
            newEnd = newEnd.next;
        }
        //For even
        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    newEnd.next = curr;
                    newEnd = curr;
                    curr = prev.next;
                }
            }
        }
        //when curr become end
        else {
            prev = curr;
        }
        //for rearranging the code
        if(end!=newEnd && end.data%2!=0){
            prev.next = end.next;
            end.next = null;
            newEnd.next = end;
        }


    }


    public static void main(String[] args) {
        LLPracticeQue list = new LLPracticeQue();

        //------problem 1 --------
//        Node head1,head2;
//
//        head1 = new Node(10);
//        head2 = new Node(3);
//
//        Node newNode = new Node(6);
//        head2.next = newNode;
//        newNode = new Node(9);
//        head2.next.next = newNode;
//
//        newNode = new Node(15);
//        head1.next = newNode;
//        head2.next.next.next = newNode;
//
//        newNode = new Node(30);
//        head1.next.next = newNode;
//        head1.next.next.next = null;
//
//        Node intersectionPoint= list.getIntersectionNode(head1, head2);
//        if (intersectionPoint == null) {
//            System.out.print(" No Intersection Point \n");
//        }
//        else {System.out.print("Intersection Point: "+ intersectionPoint.data);
//        }
        //-------------------------------------------

        //-------Problem 2------------
//        list.addFirst(8);
//        list.addFirst(7);
//        list.addFirst(6);
//        list.addFirst(5);
//        list.addFirst(4);
//        list.addFirst(3);
//        list.addFirst(2);
//        list.addFirst(1);
//        list.print();
//
//        list.skipMdeleteN(head,2,2);
//        list.print();

//     ---------Problem 3-------------------------
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.print();
//        list.swapNode(head, 2, 4);
//        list.print();

// -------Problem 4----------------------------------
        list.segregateOddEven();
        list.print();

//  -------------------Problem 5------------------
    }
}
