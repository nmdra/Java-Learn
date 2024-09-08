package DataStructures.Queue.Quiz.Q1;

import DataStructures.Queue.QueueException;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) throws QueueException {
        LinearQueueX q1 = new LinearQueueX(10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Names: ");

        String input = scanner.nextLine();

        String[] names = input.split(",");

        for(String name : names) {
            q1.insert(name.trim());
        }

        while(!q1.isEmpty()) {
            System.out.println(q1.remove());
        }


    }
}


