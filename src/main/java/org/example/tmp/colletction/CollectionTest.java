package org.example.tmp.colletction;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList(List.of("a","f", "b"));
//        for (String s: al)
//            System.out.println(s);
        ListIterator<String> alListIterator = al.listIterator();

        while (alListIterator.hasPrevious()) {
            System.out.println(alListIterator.previous());
        }

        LinkedList<String> linkedList = new LinkedList<>(List.of("a","f", "b"));
        ListIterator<String> llIterator = linkedList.listIterator();
        while (llIterator.hasPrevious()) {
            System.out.println(llIterator.previous());
        }


//        Set<Integer> set = new HashSet<>(Arrays.asList(1,5,2,3,55,11));
//
//
//        ArrayList list1 = new ArrayList();
//        list1.add(21);
//        list1.add("string");
//
//        ArrayList<Integer> list2 = new ArrayList();
//        list2.add((Integer) list1.get(1));
//        System.out.println(list2.get(0));



//
//        System.out.println("\nLinkedList iterator:");
//        LinkedList<String> ll = new LinkedList<>(List.of("a","f", "b"));
//        ListIterator<String> llListIterator = ll.listIterator();
//        while (llListIterator.hasPrevious()) {
//            System.out.println(llListIterator.previous());
//        }


    }

}
