package DSA.LINKEDLIST;

import java.nio.channels.Pipe.SourceChannel;

public class DoubleLinkedList {
    public class node {
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    public static node head;
    public static node tail;
    public static int size;

    // add

    public void addFirst(int data) {
        node newnode = new node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    // addLast
    public void addLast(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
        }

        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    // removeFirst

    public void removeFirst() {
        if (head == null) {
            System.out.println("DLL IS EMPTY");
        }
        if (size == 1) {
            head = tail = null;
            size--;
        }
        head = head.next;
        head.prev = null;
        size--;

    }

    //removeLast

    public void removeLast(){
        if(head==null){
            System.out.println("DLL IS EMPTY");
        }
        if(size==1){
            head=tail=null;
            size--;
        }
        tail=tail.prev;
        tail.next=null;
        size--;

    }

    //reverse

    public void reverse(){
        if(head==null){
            System.out.println("DLL IS EMPTY");
        }

        node curr =head;
        node prev=null;
        node next;
        while (curr !=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        
        }
        head=prev;
 
    }

    // print

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <---> ");
            temp = temp.next;

        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.print();
        dll.reverse();
        dll.print();
    }

}
