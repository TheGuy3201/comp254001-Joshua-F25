package exercise2;

import java.util.Comparator;

public class DriverLab7Ex2 {
    public static void main(String[] args) {
        System.out.println("=== Lab 7 Exercise 2: Bottom-Up Merge Sort for Queues ===\n");

        System.out.println("Test 1: Integer Queue");
        LinkedQueue<Integer> intQueue = new LinkedQueue<>();
        intQueue.enqueue(50);
        intQueue.enqueue(30);
        intQueue.enqueue(70);
        intQueue.enqueue(20);
        intQueue.enqueue(10);
        intQueue.enqueue(40);
        intQueue.enqueue(60);

        System.out.println("Before sorting: " + intQueue.toString());

        // Use natural ordering comparator for integers
        Comparator<Integer> intComp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };

        MergeSort.mergeSortBottomUp(intQueue, intComp);
        System.out.println("After sorting:  " + intQueue.toString());
    }
}
