// Lab Exercise 1-a

package DataStructures.Stack.Quiz.Q1.LabSheet1;

public class Stack {
    private final int maxSize;
    private final char[] stackArray;
    private int top;

    public Stack(int Size) {
        maxSize = Size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(char value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full");
        }
    }

    public char pop() {
        if(!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

    public char peek() {
        if(!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }
}
