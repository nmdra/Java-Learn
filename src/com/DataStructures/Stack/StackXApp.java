package DataStructures.Stack;

public class StackXApp {
    public static void main(String[] args) {
        StackX stack = new StackX(10);
//        Stack<Object> stack1 = new Stack<>(); // In-Built Stack

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        System.out.println(stack.pop() + " is Popped");
        System.out.println(stack.peek());

        System.out.println("Number of elements: " + stack.getCount());
        stack.printStack();
    }
}
