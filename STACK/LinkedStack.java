package DSA.STACK;


public class LinkedStack {

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        static node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // PUSH
        public static void push(int data) {
            node newnode = new node(data);

            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        // POP
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // PEAK

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(33);

       
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }

}
