package DSA.LINKEDLIST;

public class findNTH {

    public class node {
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

    // APPEND

    public void addFirst(int data) {

        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    // print
    public void print() {

        if (head == null) {
            System.out.println("LINKEDLIST IS EMPTY");
        }

        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;

        }
        System.out.println("NULL");
    }

    // find nth

    public void delete(int n) {
        if (n == 0) {
            head = head.next;
        } else {
            node temp = head;

            for (int i = 0; i < n-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

    }

    // PALINDROM
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

        if (head == null || head.next == null) {
            return true;
        }

        node middle = findmid(head);

        node pre = null;
        node current = middle;
        node next;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;

        }
        node right = pre;
        node left = head;
        while (right !=null) {
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
            
        }
        return true;
    }

    public static void main(String[] args) {

        findNTH nth = new findNTH();

        nth.addFirst(2);
        nth.addFirst(1);
        nth.addFirst(3);
        nth.addFirst(4);

        nth.delete(2);
        nth.print();
        System.out.println(nth.palindrom());

    }
}
