package LINKEDLIST;


class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = next;
    }
   
}

public class ll {

    public void add(int data){

         node newnode = new node(data);
        
        
    }

    public static int multiply (node first,node second){

        int num1=0;
        int num2=0;

        while (first!=null || second!=null) {

            if(first!=null){

                num1=(num1*10)+first.data;
                first=first.next;
        
            }
            if(second!=null){
                num2=(num2*10)+second.data;
                second=second.next;
            }
            
        }
        int anser= (num1*num2);
        return anser;

    }

    public static void main(String[] args) {
        node head1 = new node(9);
        head1.next= new node(4);
        head1.next.next= new node(6);


        node head2= new node(8);
        head2.next = new node(4);
        System.out.println(multiply(head1,head2));
    }
}