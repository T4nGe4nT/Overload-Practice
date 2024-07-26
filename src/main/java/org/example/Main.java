package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>(); // Set type of the list to the Object Animal
        Scanner scanner = new Scanner(System.in);


        System.out.println("Animal Menu");
        System.out.println("Enter nothing to stop the loop.");


        while (true) {
            System.out.println("Please enter a name:"); // We want to catch the name
            String input = scanner.nextLine();
            if (input == null || input.isEmpty()) { // If the name input is empty we want to break
                break;
            } else { // Otherwise we can continue
                System.out.println("Is dog? (True or False)");
                boolean query = scanner.nextBoolean();
                scanner.nextLine(); // This should make it consume the next line?
                Animal one = new Animal(input, query); // Instantiate the Animal object
                list.add(one); // Add captured info to list

            }
        }
        for (Animal animal : list) // Iterate over animal
            System.out.println(animal); // Print out that iteration


    }



}