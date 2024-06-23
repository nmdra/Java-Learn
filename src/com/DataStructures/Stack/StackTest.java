package DataStructures.Stack;

public class StackTest {
    public static void main(String[] args) throws StackException {

        System.out.println("===Stack===");

        CustomStack stack = new CustomStack(4);
//        Stack<Object> stack1 = new Stack<>(); // In-Built Stack

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println("Number of elements: " + stack.getCount());
        stack.printStack();

        System.out.println("===Dynamic Stack===");

        CustomStack dStack = new DynamicStack(4);
//        Stack<Object> stack1 = new Stack<>(); // In-Built Stack

        dStack.push(1);
        dStack.push(2);
        dStack.push(3);
        dStack.push(4);
        dStack.push(5);

        System.out.println(dStack.peek());
        System.out.println(dStack.pop());
        System.out.println(dStack.peek());

        System.out.println("Number of elements: " + dStack.getCount());
        dStack.printStack();

    }
}
