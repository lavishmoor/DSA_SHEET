package DSA.ARRAYSLIST;


import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);


        list1.set(0, 50);

        System.out.println(list1);
        list1.get(2);

        list1.remove(2);
        System.out.println(list1);

       System.out.println( list1.contains(500));

       for(int i=0;i<list1.size();i++){
        System.out.print(list1.get(i)+" ");
       }

    }

}
