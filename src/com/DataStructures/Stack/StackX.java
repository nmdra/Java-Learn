package DataStructures.Stack;

// DSA Tutorial 01 - Q02

public class StackX {
    int top;
    int maxSize;
    int[] stackArr;

    public StackX(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
        this.stackArr = new int[maxSize];
    }

    public boolean isEmpty() {
         return  top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int getCount(){
        return top + 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.print("Stack is Full\n");
        } else {
            stackArr[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is Empty\n");
            return -99;
        } else {
            return stackArr[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.print("Stack is Empty\n");
            return -99;
        } else {
            return stackArr[top];
        }
    }

    public void printStack(){
        if (isEmpty()){
            System.out.println("[]");
        } else {
            System.out.print("[ ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("%d, ",stackArr[i]);
            }
            System.out.print("]\n");
        }
    }

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
