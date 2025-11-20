package exercise3;

import java.util.Comparator;

public class DriverLab5Ex3 {
    public static void main(String[] args) {
        //create an unsorted priority queue
        HeapPriorityQueue<String,String> heapQueue = new HeapPriorityQueue<String,String>();
        heapQueue.insert("47", "A");
        heapQueue.insert("75", "C");
        heapQueue.insert("28", "B");
        heapQueue.insert("51", "D");
        heapQueue.insert("31", "F");
        heapQueue.insert("22", "G");
        heapQueue.insert("15", "H");

        // list all entries before upheap
        System.out.println("Before upheapRecursive at index 4:");
        for (int i=0;i < heapQueue.size();i++)
            System.out.println("(" +heapQueue.heap.get(i).getKey() +
                    ", " + heapQueue.heap.get(i).getValue() + ")" );

        heapQueue.upheapRecursive(4);

        System.out.println("After upheapRecursive at index 4:");
        // list all entries before upheap
        for (int i=0;i < heapQueue.size();i++)
            System.out.println("(" +heapQueue.heap.get(i).getKey() +
                    ", " + heapQueue.heap.get(i).getValue() + ")" );
    }
}
