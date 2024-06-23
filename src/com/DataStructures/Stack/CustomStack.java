package DataStructures.Stack;

public class CustomStack {
    protected int[] stackArray;
    protected int top = -1;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomStack() {
        this(DEFAULT_CAPACITY); // Call Parameterized Constructor
    }

    public CustomStack(int size) {
        this.stackArray = new int[size];
    }

    public void push(int value) throws StackException {
        if(isFull()){
            throw new StackException("Stack is Full");
        }

        stackArray[++top] = value;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is Empty");
        }

        return stackArray[top--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        } else {
            return stackArray[top];
        }
    }

    protected boolean isEmpty() {
        return top == -1;
    }

    protected boolean isFull() {
        return top == stackArray.length - 1;
    }

    public int getCount(){
        return top + 1;
    }

    public void printStack(){
        if (isEmpty()){
            System.out.println("[]");
        } else {
            System.out.print("[ ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("%d, ",stackArray[i]);
            }
            System.out.print("]\n");
        }
    }
}
