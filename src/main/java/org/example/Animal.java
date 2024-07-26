package org.example;

public class Animal {
    private String name;
    private boolean dog;

    public Animal(String name, boolean dog) {
        this.name = name;
        this.dog = dog;
    }
    public Animal(String name) {   // Second overload constructor for if no boolean is passed.
        this.name = name;
        this.dog = false;
    }
    public String getName() {
        return name;
    }
    public boolean isDog() {
        return dog;
    }

    @Override // Don't think I need this Override if im not asking the string to look like a JSON?
    public String toString() {
        return  name + " is a dog = " + dog; // to string Override?
    }


}