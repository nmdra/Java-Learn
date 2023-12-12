package Collections.Stack;

import java.util.Stack;

/**
 * Example class demonstrating the usage of Stack in Java.
 */
public class StackExample {

    /**
     * Main method to demonstrate Stack usage.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating a Stack of Integer type
        Stack<Integer> integerStack = new Stack<>();

        // Pushing elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Peeking at the top element (without removing)
        System.out.println("Top element of the stack: " + integerStack.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + integerStack.pop());
        System.out.println("Popped element: " + integerStack.pop());

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + integerStack.isEmpty());

        // Pushing more elements
        integerStack.push(40);
        integerStack.push(50);

        // Size of the stack
        System.out.println("Size of the stack: " + integerStack.size());

        // Iterating through the stack
        System.out.println("Elements in the stack:");
        for (Integer element : integerStack) {
            System.out.println(element);
        }

        // Searching for an element in the stack
        int searchElement = 40;
        int position = integerStack.search(searchElement);
        if (position != -1) {
            System.out.println(searchElement + " found at position " + position + " from the top of the stack.");
        } else {
            System.out.println(searchElement + " not found in the stack.");
        }

        // Clearing the stack
        integerStack.clear();
        System.out.println("Stack after clearing: " + integerStack);
    }
}
