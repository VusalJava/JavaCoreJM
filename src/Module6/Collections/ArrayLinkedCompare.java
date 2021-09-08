package Module6.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ArrayLinkedCompare {
    public static final long size = 100_000;

    public static void main(String[] args) {

        ArrayList<Number> arrayList = new ArrayList<>();
        LinkedList<Number> linkedList = new LinkedList<>();

        ArrayLinkedCompare arr = new ArrayLinkedCompare();

        //Arraylist timing
        long result = arr.compute(arrayList,1,size);
        System.out.println(result);

        //Linked list timing
        long result2 = arr.compute(linkedList,2,size);
        System.out.println(result2);




    }

    <T> long compute(Collection<T> collection, T element,long size){
        long start = System.nanoTime();
        for (long i = 0; i <size ; i++) {
            collection.add(element);
        }
        long end = System.nanoTime();

        return (end-start)/1000000;
    }


}
