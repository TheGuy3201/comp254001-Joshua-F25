package exercise2;

public class DriverLab4EX2 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new LinkedStack<>();
        Stack<Integer> stack2 = new LinkedStack<>();

        // Push elements onto stack1
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        System.out.println("Stack 1 before transfer:");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }

        // Push elements onto stack1 again for transfer
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        // Transfer elements from stack1 to stack2
        stack1.transfer(stack1, stack2);

        System.out.println("Stack 2 after transfer:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}
