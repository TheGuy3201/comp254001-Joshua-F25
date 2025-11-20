package exercise2;

public class DriverLab6EX2 {
    public static void main(String[] args) {

        SortedTableMap <Integer, String> map = new SortedTableMap<>();
        map.put(5, "Five");
        map.put(2, "Two");
        map.put(8, "Eight");
        map.put(1, "One");

        System.out.println("Testing containKey method:");
        System.out.println("Contains key 5: " + map.containKey(5));
        System.out.println("Contains key 3: " + map.containKey(3));
    }
}
