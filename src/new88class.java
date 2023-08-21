//import java.util.ArrayList;



//import java.util.Set;

//import java.util.TreeSet;

import java.util.ArrayList;
import java.util.Collections;

public class new88class {
    public static void main(String[] args) {
       // ArrayList
       // Set
       // TreeSet
       // Collections

        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list2 = new ArrayList<String>();
//        ArrayList<Boolean> list3 = new ArrayList<Boolean>();
//
        //add list
        list.add(0);
        list.add(4);
        list.add(7);
        System.out.println(list);

        //get element
         int element = list.get(0);
        System.out.println(element);
        int element1 = list.get(2);
        System.out.println(element1);

        //add element in between
        list.add(1, 1);
        System.out.println(list);


        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);


        //size
        int size = list.size();
        System.out.println(size);


        //loops
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting means arrange elements in ascending order or descending order

    Collections.sort(list);
        System.out.println(list);



    }
}
