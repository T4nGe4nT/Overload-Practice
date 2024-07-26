package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TvMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        System.out.println("TV Show Menu");
        System.out.println("Enter nothing to stop the loop.");

        while (true) {
            System.out.println("Enter the name of a show:");
            String showName = scanner.nextLine();
            if (showName == null || showName.isEmpty()) {
                break;
            } else {
                System.out.println("Do you want to provide episodes and genre? (yes/no)"); // Found a way to add in an option to ask. this is cool
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("no")) {
                    TvShow tvShow = new TvShow(showName);
                    tvShows.add(tvShow); // I think this will make it default the genre too.
                } else if (response.equalsIgnoreCase("yes")) {
                    System.out.println("How many episodes does it have?");
                    int episodes = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    System.out.println("What is the genre of the show?");
                    String genre = scanner.nextLine();

                    TvShow tvShow = new TvShow(showName, episodes, genre);
                    tvShows.add(tvShow);
                } else {
                    System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                }
            }
        }

        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}

