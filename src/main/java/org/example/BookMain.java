package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Books Menu");
        System.out.println("Enter nothing to exit.");

        while (true) {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            } else {
                System.out.print("How many pages?");
                int pages = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Do you want to enter a publication year? (yes/no)");
                String response = scanner.nextLine();

                if (response.equals("yes")) {
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();


                    Book book = new Book(title, pages, year);
                    books.add(book);
                } else {
                    Book book = new Book(title, pages);
                    books.add(book);
                }


            }

        }
        System.out.println("What would you like to see?");
        System.out.println("Choose: Title, Pages, Year, Everything");
        String option = scanner.nextLine();

        for (Book book : books) {
            switch (option) {
                case "Title":
                    System.out.println("Title: " + book.getTitle());
                    break;
                case "Pages":
                    System.out.println("Pages: " + book.getPages());
                    break;
                case "Year":
                    System.out.println("Published: " + book.getYear());
                    break;
                case "Everything":
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Pages: " + book.getPages());
                    System.out.println("Published: " + book.getYear());
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;

            }
        }
    }
}
