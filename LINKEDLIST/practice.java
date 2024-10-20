package LINKEDLIST;

public class practice {

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

    public void dlt_without_head(Node dlt) {

        // 1--12--1--4--1--null
        Node prev = null;

        while (dlt.next != null) {
            dlt.data = dlt.next.data;
            prev = dlt;
            dlt = dlt.next;

        }

        prev.next = null;

    }


    public void removeduolicate(Node head){



        Node curr1=head;
        while (curr1.next!=null) {
            
            Node curr2=curr1;
            while (curr2.next!=null) {

                if(curr2.next.data==curr1.data){
                    curr2.next=curr2.next.next;
                }
                else{
                    curr2=curr2.next;
                }
                
            }
            curr1=curr1.next;
        }
    }
    public static void main(String[] args) {

        practice ll = new practice();

        ll.addlast(1);
        ll.addlast(12);
        ll.addlast(1);
        ll.addlast(4);
        ll.addlast(1);
        ll.print();
        ll.removeduolicate(ll.head);
        ll.print();
    }
}
