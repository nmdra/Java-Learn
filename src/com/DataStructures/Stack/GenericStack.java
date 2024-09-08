package DataStructures.Stack;

public class GenericStack<T> {

    int top;
    int maxSize;
    T[] stackArr;

    @SuppressWarnings("unchecked")
    public GenericStack(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
        this.stackArr = (T[]) new Object[maxSize];
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

    public void push(T value) {
        if (isFull()) {
            System.out.print("Stack is Full\n");
        } else {
            stackArr[++top] = value;
        }
    }

    public T pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        } else {
            return stackArr[top--];
        }
    }

    public T peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
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
                System.out.printf("%s, ",stackArr[i]);
            }
            System.out.print("]\n");
        }
    }
}

