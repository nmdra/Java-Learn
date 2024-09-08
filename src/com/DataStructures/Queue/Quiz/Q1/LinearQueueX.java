package DataStructures.Queue.Quiz.Q1;

import DataStructures.Queue.QueueException;

public class LinearQueueX {
    private final int maxSize;
    private final String[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public LinearQueueX(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String item) throws QueueException {
        if (rear == maxSize - 1) {
            throw new QueueException("Queue is full");
        } else {
            nItems++;
            queueArray[++rear] = item;
        }
    }

    public String remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        } else {
            nItems--;
            return queueArray[front++];
        }
    }

    public String peekFront() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        } else {
            return queueArray[front];
        }
    }

    public Boolean isEmpty() throws QueueException {
        return nItems == 0;
    }
}