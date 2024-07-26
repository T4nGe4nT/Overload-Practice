package org.example;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Normal methods
        counter.increment();
        counter.decrement();
        System.out.println(counter.valueOf()); // Will print 0 because we went up one and down 1

        //Overloads
        counter.increment(2);
        counter.decrement(3);
        System.out.println(counter.valueOf()); //
    }
}
