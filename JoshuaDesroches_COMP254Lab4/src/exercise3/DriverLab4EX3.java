package exercise3;

public class DriverLab4EX3 {
    public static void main(String[] args){
        LinkedQueue<Integer> queue1 = new LinkedQueue<>();
        LinkedQueue<Integer> queue2 = new LinkedQueue<>();

        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        System.out.println("Creating Queue1: " + queue1);

        queue2.enqueue(40);
        queue2.enqueue(50);
        queue2.enqueue(60);
        System.out.println("Creating Queue2: " + queue2);

        System.out.println("Concatenating Queue's");
        queue1.concatenate(queue2);
        System.out.println("Resulting Queue1 after concatenation: " + queue1);
    }
}
