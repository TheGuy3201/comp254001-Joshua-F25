package exercise2;

public class Driver {
    public static void main(String[] args)
    {

        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.addFirst("MSP");
        list.addLast("ATL");
        list.addLast("BOS");
        //
        list.addFirst("LAX");
        System.out.println(list);
        //

        //-----------Test Section-----------//
        list.swapNodes(list);
        System.out.println(list);
    }
}
