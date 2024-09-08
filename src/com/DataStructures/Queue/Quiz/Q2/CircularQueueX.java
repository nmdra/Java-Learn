package DataStructures.Queue.Quiz.Q2;

import DataStructures.Queue.QueueException;


public class CircularQueueX<T> {
    private final int maxSize;
    private final T[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    @SuppressWarnings("unchecked")
    public CircularQueueX(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(T item) throws QueueException {
        if (nItems == maxSize) {
            throw new QueueException("Queue is full");
        } else {
            if(rear == maxSize - 1) {
                rear = -1;
            }

            nItems++;
            queueArray[++rear] = item;
        }
    }

    public T remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        } else {
            T temp = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

    public T  peekFront() throws QueueException {
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