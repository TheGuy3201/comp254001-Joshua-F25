package exercise1;
import importantFiles.*;

public class DriverLab5Ex1 {
    public static void main(String[] args) {
        //create and populate a linked binary tree
	  LinkedBinaryTree lbt = new LinkedBinaryTree();
	  Position<String> root = lbt.addRoot("ICET");

	  //Initialize the rest of the tree
	  Position<String> softwarePosition = lbt.addLeft(root, "Software");
	  lbt.addRight(root, "Networking");
	  lbt.addLeft(softwarePosition, "SET");
	  lbt.addRight(softwarePosition, "IG");

        //test preorderNext method
        long startTime = System.currentTimeMillis();
	  Position<String> visitedPosition = lbt.preorderNext( root ); // should be Software
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println("Time elapsed for " + visitedPosition.getElement() + " is " + elapsed);
    }
}