package DataStructures.Queue.Quiz.Q2;

public class StackY<T> {
    int top;
    int maxSize;
    T[] stackArr;

    @SuppressWarnings("unchecked")
    public StackY(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
        this.stackArr = (T[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int getCount() {
        return top + 1;
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stackArr[++top] = value;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null; // Changed to return null instead of 0
        } else {
            return stackArr[top--];
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null; // Changed to return null instead of -99
        } else {
            return stackArr[top];
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("[]");
        } else {
            System.out.print("[ ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("%s", stackArr[i]); // Changed to %s for generic type
                if (i != 0) {
                    System.out.print(", "); // Avoid trailing comma
                }
            }
            System.out.print(" ]\n");
        }
    }
}
