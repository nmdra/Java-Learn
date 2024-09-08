package DataStructures.LinkedList.Quiz.P01;

public class StackY {
    int top;
    int maxSize;
    double[] arr;

    public StackY(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new double[maxSize];
        this.top = -1;
    }

    public void push(double x) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = x;
        }
    }

    public double pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -99;
        } else {
            return arr[top--];
        }
    }

    public double peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -99;
        } else {
            return arr[top];
        }
    }
}
