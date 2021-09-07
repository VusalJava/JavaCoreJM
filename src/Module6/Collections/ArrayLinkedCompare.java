package Module6.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedCompare {
    public static void main(String[] args) {
        ArrayList<Number> arrayList = new ArrayList<>();
        LinkedList<Number> linkedList = new LinkedList<>();

        /*Beginning*/
        System.out.println("Beginning");

        //Arraylist
        long start = System.nanoTime();
        for (long i = 0; i <100_000 ; i++) {
            arrayList.add(0,1);
        }
        long end = System.nanoTime();
        System.out.println((end-start)/1000000);

        //LinkedList
        long start2 = System.nanoTime();
        for (long i = 0; i <100_000 ; i++) {
            linkedList.add(2);
        }
        long end2 = System.nanoTime();
        System.out.println((end2-start2)/1000000);

        /*Middle*/
        System.out.println("Middle");
        //ArrayList
        long start3 = System.nanoTime();
        for (long i = 0; i <100_000 ; i++) {
            arrayList.add(100_000/2,3);
        }
        long end3 = System.nanoTime();
        System.out.println((end3-start3)/1000000);

        //LinkedList
        long start4 = System.nanoTime();
        for (long i = 0; i <100_000 ; i++) {
            linkedList.add(100_000/2,3);
        }
        long end4 = System.nanoTime();
        System.out.println((end4-start4)/1000000);

        /*End*/
        System.out.println("End");
        //ArrayList
        long start5 = System.nanoTime();
        for (long i = 0; i <100_000 ; i++) {
            arrayList.add(5);
        }
        long end5 = System.nanoTime();
        System.out.println((end5-start5)/1000000);

        //LinkedList
        long start6 = System.nanoTime();
        for (long i = 0; i <100_000 ; i++) {
            linkedList.add(6);
        }
        long end6 = System.nanoTime();
        System.out.println((end6-start6)/1000000);



    }
}
