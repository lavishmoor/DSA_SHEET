package DSA.LINKEDLIST;

import DSA.ARRAYS.nextPermutation;
import DSA.ARRAYSLIST.sorting;

public class linkedlist {

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

    // PRETEND

    public void addFirst(int data) {

        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    // APPEND

    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;

    }

    // ADD AT INDEX

    public void addIndex(int index, int data) {

        if (index == 0) {
            addFirst(data);
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;

    }

    // REMOVE FROM FIRST
    public void removeFirst() {

        Node temp = head;

        if (size == 0) {
            System.out.println("ll is empty");
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
        }

        head = head.next;
        temp.next = null;
        size--;
    }

    // REMOVE FROM LAST

    public void removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
        }
        Node temp = head;
        while (temp != tail) {
            temp = temp.next;
        }
        tail = temp.next;
        temp.next = null;
        size--;

    }

    // SEARCH

    public int search(int key) {

        if (size == 0) {
            System.out.println("ll is empty");
        }
        Node temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.data == key) {

                return i;

            }

            temp = temp.next;

        }
        return -1;
    }

    // REVERSE
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
 
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }
    // PRINT

    public void print() {

        if (head == null) {
            System.out.println("LINKEDLIST IS EMPTY");
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;

        }
        System.out.println("NULL");
    }

    public void zigzag() {

        // mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        System.out.println(mid.data);
                    
                //1-2-3-4-5-null
        //reverse 
        Node curr = mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while (curr !=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        Node left=head;
        Node right=prev;
        Node nextl,nextr;

        while (left !=null && right!=null) {

            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left=nextl;
            right=nextr;

            
        }



    }
 
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        ll.zigzag();
        ll.print();
    }

}
