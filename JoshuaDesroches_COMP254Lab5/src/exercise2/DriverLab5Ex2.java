package exercise2;
import importantFiles.*;

public class DriverLab5Ex2 {
    public static void main(String[] args)
    {
        LinkedBinaryTree lbt = new LinkedBinaryTree();
        Position<String> root = lbt.addRoot("ICET");

        //Initialize the rest of the tree
        Position<String> softwarePosition = lbt.addLeft(root, "Software");
        lbt.addRight(root, "Networking");
        lbt.addLeft(softwarePosition, "SET");
        lbt.addRight(softwarePosition, "IG");

        LinkedBinaryTree.printHeight(lbt, softwarePosition); // should be Software
    }
}
