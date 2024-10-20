package DSA.LINKEDLIST;

class reverse {

    public class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public void print() {

        if (head == null) {
            System.out.println("linked list is empty");

        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;

        }
        System.out.println("NULL");
    }

    public void addfirst(int data) {
        node newnode = new node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;

    }

    public void insert(int index, int data) {

        node newnode = new node(data);
        size++;
        if (index == 0) {
            newnode.next = head;
            head = newnode;
        }
        node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void removefirst() {

        node temp = head;

        if (size == 0) {
            System.out.println("linkedlist is empty");
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
        }

        head = head.next;
        temp.next = null;
        size--;
    }

    public void removelast() {

        if (size == 0) {
            System.out.println("linkedlist is empty");
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
        }

        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteNthfromEnd(int n) {

        int sz = 0;
        node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;

        }

        if (n == sz) {
            head = head.next;
            return;

        }
        int i = 1;
        node prev = head;
        while (i < size - n) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;

    }

    public void reverse() {

        node pre = null;
        node curr = tail = head;
        node next;

        while (curr != null) {

            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
    }

    // slow fast approach//

    public node findmid(node head) {
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindrom() {
        if (head == null || head.next != null) {
            return true;

        }

        // find mid
        node middle = findmid(head);

        // revrse the sencond half

        node pre = null;
        node curr = middle;
        node next;

        while (curr != null) {

            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;

        }
        node right = pre;
        node left = head;

        // check left and right half

        while (right != null) {
            if (left.data != right.data) {

                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;

    }

    public static void main(String[] args) {

        reverse rll = new reverse();
      
        rll.addlast(1);
        rll.addlast(2);
        rll.addlast(2);
        rll.addlast(1);
        rll.print();
        System.out.println(rll.palindrom());
    }
}
