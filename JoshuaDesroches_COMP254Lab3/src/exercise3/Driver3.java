package exercise3;

public class Driver3 {
    public static void main(String[] args) {
        // Example usage of find
        java.io.File root = new java.io.File("D:\\Sem5-F25");
        String filenameToFind = "Driver2.java";

        System.out.println("\nSearching for file: " + filenameToFind);

        System.out.println("Search result: " + FindFiles.find(root, filenameToFind));
    }
}