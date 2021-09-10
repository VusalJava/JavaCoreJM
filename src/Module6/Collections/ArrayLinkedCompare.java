package Module6.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedCompare {
    public static final long SIZE = 100_000;
    public static final long ADD = 5_000;

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        create(arrayList, 6);
        create(arrayList1, 6);
        create(arrayList2, 6);

        create(linkedList, 6);
        create(linkedList1, 6);
        create(linkedList2, 6);  /// добавление 100_000 элеметнов


        System.out.println("BEG ");

        System.out.println("AL " + addBegin(arrayList, 5));   // 5_000 элементов
        System.out.println("LL " + addBegin(linkedList, 5));

        System.out.println("Med");

        System.out.println("AR " + addMed(arrayList1, 5));
        System.out.println("LL " + addMed(linkedList1, 5));

        System.out.println("End");

        System.out.println("AR " + addEnd(arrayList2, 5));
        System.out.println("LL " + addEnd(linkedList2, 5));


    }

    static <T> void create(List<T> collection, T element) {
        for (long i = 0; i < SIZE; i++) {
            collection.add(0, element);
        }
    }


    static <T> long addBegin(List<T> collection, T element) {
        long start = System.nanoTime();
        for (long i = 0; i < ADD; i++) {
            collection.add(0, element);
        }
        long end = System.nanoTime();

        return (end - start);
    }

    static <T> long addMed(List<T> collection, T element) {
        long start = System.nanoTime();
        for (long i = 0; i < ADD; i++) {
            collection.add(collection.size() / 2, element);
        }
        long end = System.nanoTime();

        return (end - start);
    }

    static <T> long addEnd(List<T> collection, T element) {
        long start = System.nanoTime();
        for (long i = 0; i < ADD; i++) {
            collection.add(element);
        }
        long end = System.nanoTime();

        return (end - start);
    }


}
