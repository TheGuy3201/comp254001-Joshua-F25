package exercise3;

public class Driver {
    public static void main(String[] args)
    {
        CircularlyLinkedList<String> circularList = new CircularlyLinkedList<String>();
        circularList.addFirst("LAX");
        circularList.addLast("MSP");
        circularList.addLast("ATL");
        circularList.addLast("BOS");
        //
        System.out.println(circularList);

        try {
            CircularlyLinkedList<String> clonedList = circularList.clone();
            System.out.println("Cloned list: " + clonedList);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
