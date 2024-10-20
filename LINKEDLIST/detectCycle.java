package DSA.LINKEDLIST;

import JAVA.stars;

public class detectCycle {

    public static class node {

        int data;
        node next;

        public node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public void newfirst(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

    }

    public void print() {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;

        }
        System.out.println("NULL");

    }

    public static boolean cycle() {

        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public void cycleWithIndex(node head) {

        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if(fast==null && fast.next==null){
            return;
        }
        while (head !=slow) {
            head=head.next;
            slow=slow.next;
            
        }

        System.out.println("tail connects to node index : "+head.data);
    }


    public static void removeCycle(){
        node slow = head;
        node fast = head;
        boolean cycle =false;

        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast=fast.next.next;
            if(fast ==slow){
                cycle = true;
                break;
            }
        }

        if(cycle==false){
            return;
        }

        slow=head;
        node prev =null;
        while (slow !=fast) {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
            
        }

        prev.next=null;
    }


    public int interseationPoints(node head1,node head2){

        node tempA=head1;
        node tempB=head2;

        while(tempA!=tempB){

            if(tempA!=null){
                tempA=tempA.next;
            }
            else{
                tempA=head2;
            }
            if(tempB!=null){
                tempB=tempB.next;
            }
            else{
                tempB=head1;
            }
        }
        return tempA.data;
    }
    public static void main(String[] args) {

        detectCycle dt = new detectCycle();
 
        node head1=new node(10);
        head1.next=new node(15);
        head1.next.next=new node(30);

        node head2= new node(3);
        head2.next= new node(6);
        head2.next.next= new node(9);
        head2.next.next.next=head1.next;

        
        System.out.println("intersection ponit is : "+dt.interseationPoints(head1, head2));

    }
}
