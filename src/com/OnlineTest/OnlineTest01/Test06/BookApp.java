package OnlineTest.OnlineTest01.Test06;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book 1 Details: ");
        System.out.print("Title: ");
        book1.setTitle(sc.nextLine());

        System.out.print("Author: ");
        book1.setAuthor(sc.nextLine());

        System.out.print("pageCount: ");
        book1.setPageCount(sc.nextInt());
        sc.nextLine();

        System.out.println();

        System.out.println("Enter Book 2 Details: ");
        System.out.print("Title: ");
        book2.setTitle(sc.nextLine());

        System.out.print("Author: ");
        book2.setAuthor(sc.nextLine());

        System.out.print("pageCount: ");
        book2.setPageCount(sc.nextInt());

        System.out.println("----Display Book Details----");

        System.out.println("Display Book 1 Details:");
        book1.print();

        System.out.println();

        System.out.println("Display Book 1 Details:");
        book2.print();

    }

}
