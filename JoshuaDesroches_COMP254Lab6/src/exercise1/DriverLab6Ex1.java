package exercise1;

public class DriverLab6Ex1 {
    public static void main(String[] args) {

        System.out.println("Lab 6 Exercise 1: Implementing a Hash Map configurable load factor\n");

        ChainHashMap<String, Integer> map = new ChainHashMap<>();

        System.out.println("Inserting entries with random configurable load factor");
        for (int i = 1; i <= 20; i++) {
            double startTime = System.nanoTime();
            int loadFactor = (int)(Math.random() * 5) + 1; // Random load factor between 1 and 5
            map.put("Key" + i, i, loadFactor);
            double endTime = System.nanoTime();
            double duration = endTime - startTime;
            System.out.println("Inserted (Key" + i + ", " + i + ") with load factor " + loadFactor + " in " + duration + " nanoseconds");
        }

    }
}
