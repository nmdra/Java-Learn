// Lab Exercise 1-c

package DataStructures.Stack.Quiz.Q1.LabSheet1;

public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack(10);

        // Insert characters to the stack using push() method
        stack.push('A');
        stack.push('B');
        stack.push('C');

        // Remove the content of the stack and display them
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
