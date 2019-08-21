package dz_lesson_4.iterator;

import dz_lesson_4.linkedList.LinkedList;
import dz_lesson_4.linkedList.SimpleLinkedListImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {



        LinkedList<Integer> linkedLis = createLinkedList();

        for (Integer o : linkedLis) {
            doAction(o);
        }

//        LinkedList.Node<Integer> current = linkedLis.getFirst();
//        while (current != null) {//hasNext
//            Integer value = current.value;//next
//            doAction(value);
//            current = current.next;
//        }
//
//        System.out.println("----------");
//
//        List<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//
//
//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            Integer value = iterator.next();
//            doAction(value);
//        }
//        System.out.println("----------");
//
//        List<Integer> jdkLinkedList = new java.util.LinkedList<>();
//        jdkLinkedList.add(1);
//        jdkLinkedList.add(2);
//        jdkLinkedList.add(3);
//
//        jdkLinkedList.removeIf(value -> value % 2 == 0);
//
//        iterator = jdkLinkedList.iterator();
//        while (iterator.hasNext()) {
//            Integer value = iterator.next();
//            if (value % 2 == 0) {
//                iterator.remove();
//            }
////            doAction(value);
//        }
//
//
//        for (Integer value : arrayList) {
//            doAction(value);
//        }

    }

    private static LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(45);
        linkedList.insertFirst(10);
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);
        return linkedList;
    }

    private static void doAction(int value) {
        System.out.println(value);
    }
}