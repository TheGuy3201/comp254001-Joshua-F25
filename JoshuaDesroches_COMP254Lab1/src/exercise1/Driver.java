package exercise1;

import static exercise1.DoublyLinkedList.concatenate;

public class Driver {
    public static void main(String[] args)
    {
        //create and populate a doubly linked list
        DoublyLinkedList<String> listA = new DoublyLinkedList<String>();
        listA.addFirst("MSP");
        listA.addLast("ATL");
        listA.addLast("BOS");
        listA.addLast("DFW");
        //
        listA.addFirst("LAX");

        System.out.println(listA);
        System.out.println(listA.first());

        //-------------New Stuff for Exercise 1--------------
        DoublyLinkedList<String> listB = new DoublyLinkedList<String>();
        listB.addFirst("BYB");
        listB.addLast("NCR");
        listB.addLast("TXS");
        listB.addLast("NYC");
        listB.addLast("BOB");
        //

        DoublyLinkedList<String> listC = concatenate(listA, listB);

        System.out.println(listB);
        System.out.println(listB.first());

        System.out.println(listC);
        System.out.println(listC.last());
    }
}
