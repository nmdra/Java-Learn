package DataStructures.Queue;

public class LinearQueue {
    private final int maxSize;
    private final int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public LinearQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int item) throws QueueException {
        if (isFull()) {
            throw new QueueException("Queue is full");
        } else {
            queueArray[++rear] = item;
            nItems++;
        }
    }

    public int dequeue() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        } else {
            nItems++;
            return queueArray[front++];
        }
    }

    public int peekFront() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        } else {
            return queueArray[front];
        }
    }

    public boolean isEmpty(){
       return nItems == 0;
    }

    public boolean isFull(){
        return rear == maxSize - 1;
    }

    public static void main(String[] args) throws QueueException {
        LinearQueue q1 = new LinearQueue(4);

        // test cases to insert
        q1.enqueue(10);
        q1.enqueue(25);
        q1.enqueue(85);
        q1.enqueue(98);

        // code to check the queue is full
        // q1.enqueue(100);

        System.out.println("Peek Front: " + q1.peekFront());

        for(int i=0;i<4;i++) {
            System.out.println(q1.dequeue());
        }
    }
}
