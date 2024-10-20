package DSA.ARRAYSLIST;


import java.util.ArrayList;

import java.util.Collections;
import java.util.*;

public class sorting {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Ascending order
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // Descending order 
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
