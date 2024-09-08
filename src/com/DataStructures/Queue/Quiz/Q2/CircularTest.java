package DataStructures.Queue.Quiz.Q2;

import DataStructures.Queue.QueueException;

import java.util.Scanner;

public class CircularTest {
    public static void main(String[] args) throws QueueException {
        CircularQueueX<Character> circularQueueX = new CircularQueueX<>(10);

        StackY<Character> stackY = new StackY<>(5);

        System.out.println("Enter 5 Characters:");

        Scanner sc = new Scanner(System.in);

        char[] characters = sc.nextLine().trim().substring(0, 5).toCharArray();

        for(char ch : characters) {
            stackY.push(ch);
        }

        while(!stackY.isEmpty()) {
            circularQueueX.insert(stackY.pop());
        }

        System.out.println("Before:");
        for(int i = 0; i < 5; i++){
            char temp = circularQueueX.remove();
            System.out.print(temp + " ");
            circularQueueX.insert(temp);
        }

        for(int i = 0; i < 5; i++){
            char temp = circularQueueX.remove();
            stackY.push(temp);
            circularQueueX.insert(temp);
        }

        while(!stackY.isEmpty()) {
            circularQueueX.insert(stackY.pop());
        }

        System.out.println("\nAfter:");
        while(!circularQueueX.isEmpty()) {
            System.out.print(circularQueueX.remove() + " ");
        }

    }
}