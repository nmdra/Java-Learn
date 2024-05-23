package PastPapers.Y23NovVerF.Q01A;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        PriorityQueue<String> bookNames = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the Title of Book: ");
            String bookName = sc.nextLine();

            if (bookName.equals("done")) {
                break;
            } else {
                bookNames.add(bookName);
            }
        }

        System.out.println("Enter Title to Remove: ");
        String toRemove = sc.nextLine();

        if (bookNames.contains(toRemove)) {
            bookNames.remove(toRemove);
        } else {
            System.out.println(toRemove + "is not found");
        }

        System.out.println("Total no. Of Books: " + bookNames.size());

        System.out.println("Book Titles:");
        for (String bookName : bookNames) {
            System.out.println("\t" + bookName);
        }

    }
}
