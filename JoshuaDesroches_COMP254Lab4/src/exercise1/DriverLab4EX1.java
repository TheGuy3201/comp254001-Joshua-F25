package exercise1;

public class DriverLab4EX1 {
    public static void main(String[] args) {

        System.out.println("Driver for Lab 4 Exercise 1 - testing indexOf");

        SimpleLinkedPositionalList<String> list = new SimpleLinkedPositionalList<>();
        Position<String> p1 = list.addLast("A");
        Position<String> p2 = list.addLast("B");
        Position<String> p3 = list.addLast("C");
        Position<String> p4 = list.addLast("D");

        // print positions and indexOf results
        System.out.println("List contents (by iteration):");
        int i = 0;
        for (String s : list) {
            System.out.println("  index " + i + ": " + s);
            i++;
        }

        System.out.println("\nTesting indexOf on stored positions:");
        System.out.println("indexOf(p1) expected 0 -> " + list.indexOf(p1));
        System.out.println("indexOf(p2) expected 1 -> " + list.indexOf(p2));
        System.out.println("indexOf(p3) expected 2 -> " + list.indexOf(p3));
        System.out.println("indexOf(p4) expected 3 -> " + list.indexOf(p4));


    }
}
