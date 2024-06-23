package DataStructures.Queue;

public class CircularQueue {
    private final int maxSize;
    private final int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int item) throws QueueException {
        if (nItems == maxSize) {
            throw new QueueException("Queue is full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            nItems++;
            queueArray[++rear] = item;
        }
    }

    public int dequeue() throws QueueException {
        if (nItems == 0) {
            throw new QueueException("Queue is Empty");
        } else {
            int temp = queueArray[front++];
            if (front == maxSize)
                front = 0;
            nItems--;
            return temp;
        }
    }

    public int peekFront() throws QueueException {
        if (nItems == 0) {
            throw new QueueException("Queue is empty");
        } else {
            return queueArray[front];
        }
    }

    public void printStack(){
        if (nItems == 0){
            System.out.println("[]");
        } else {
            System.out.print("[ ");
            for (int i = 0; i < nItems; i++) {
                System.out.print(" " + queueArray[i]);
            }
            System.out.print("]\n");
        }
    }

    public static void main(String[] args) throws QueueException {
        CircularQueue q1 = new CircularQueue(4);

        // test cases to insert
        q1.enqueue(10);
        q1.enqueue(25);
        q1.enqueue(85);
        q1.enqueue(98);

        // code to check the queue is full
        System.out.println("Front: " + q1.dequeue());
        System.out.println("Front: " + q1.dequeue());

        System.out.println("Peek Front: " + q1.peekFront());

        q1.printStack();

        q1.enqueue(20);
        q1.enqueue(50);

        q1.printStack();

//        q1.enqueue(100);
    }
}
