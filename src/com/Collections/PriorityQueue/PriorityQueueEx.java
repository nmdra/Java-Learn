package Collections.PriorityQueue;

import java.util.PriorityQueue;

/**
 * First-In First-Out
 * When new elements are inserted into the PriorityQueue, they are ordered based on their natural ordering, or by a defined Comparator provided when we construct the PriorityQueue.
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(45);
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(15);

        System.out.println("PriorityQueue elements: " + priorityQueue);

        // Printing the top element of PriorityQueue
        System.out.println(priorityQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(priorityQueue.poll());

        // Printing the top element again
        System.out.println(priorityQueue.peek());

        // Removing elements from the PriorityQueue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removed: " + priorityQueue.poll());
        }
    }

}
