package DSA.LINKEDLIST;

public class practise {

    public class node {
        int data;
        node next;
        node pre;

        public node(int data) {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    public static node head;
    public static node tail;
    public static node pre;
    public static int size;

    // APPEND

    public void addFirst(int data) {

        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        newnode.pre = null;
        head = newnode;
    }

    //
    public void print() {

        if (head == null) {
            System.out.println("LINKEDLIST IS EMPTY");
        }

        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<--> ");
            temp = temp.next;

        }
        System.out.println("NULL");
    }

    // revrse4
    public void revrse() {
        if (head == null) {
            System.out.println("ll is empty");
        }

        node curr = head;
        node prev = null;
        node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            curr.pre = next;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public node nthDelete(int n) {

        node fast = head;
        node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {

            fast = fast.next;
            slow = slow.next;

        }
        return slow.next = slow.next.next;

    }

    public void EvneOdd() {
        node even = new node(-1);
        node odd = new node(-1);

        node oddhead = odd;
        node result = even;

        node ptr = head;
        while (ptr != null) {

            if (ptr.data % 2 == 0) {
                even.next = ptr;
                even = even.next;
            } else {
                odd.next = ptr;
                odd = odd.next;
            }

            ptr = ptr.next;

        }

        even.next = null;
        odd.next = null;

        even.next = oddhead.next;

        // return result.next;
    }

    public node sort(node head) {

        node newnode = new node(-1);
        node curr1 = head;

        while (curr1 != null) {
            node curr2 = curr1;
            while (curr2 != null) {

                if (curr1.data < curr2.next.data) {
                    newnode.next = curr1;
                } else {
                    curr2 = curr2.next;
                }

            }
            curr1=curr1.next;
        }
        return newnode;

    }

    public static void main(String[] args) {

        practise pll = new practise();

        pll.addFirst(1);
        pll.addFirst(4);
        pll.addFirst(6);
        pll.addFirst(10);
        pll.addFirst(12);
        pll.addFirst(7);
        pll.addFirst(5);
        pll.addFirst(2);

        pll.print();

        pll.sort(head);
        pll.print();
        

    }
}
