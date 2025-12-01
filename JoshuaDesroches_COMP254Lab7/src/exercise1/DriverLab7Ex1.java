package exercise1;

public class DriverLab7Ex1 {
    public static void main(String[] args) {

        //Our implementation of the treeSearch utility, from Code Fragment 11.3, relies on recursion. For
        //a large unbalanced tree, it is possible that Java’s call stack will reach its limit due to the recursive
        //depth. Give an alternative implementation of that method that does not rely on the use of
        //recursion.


        System.out.println("Lab 7 Exercise 1");

        TreeMap1<String, Integer> treeMap = new TreeMap1<>();
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("cherry", 3);
        treeMap.put("raisin", 4);

        // The loopingTreeSearch method is used internally by get()
        System.out.println("Testing searches using the non-recursive implementation:");
        System.out.println("Value for 'cherry': " + treeMap.get("cherry")); // Should print 3
        System.out.println("Value for 'banana': " + treeMap.get("banana")); // Should print 2
        System.out.println("Value for 'grape': " + treeMap.get("grape")); // Should print null

    }
}
