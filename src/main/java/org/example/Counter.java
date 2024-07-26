package org.example;

public class Counter {
    int startValue;

    public Counter(int value) {
        this.startValue = value;
    }
    public Counter() {
        this.startValue = 0;
    }
    public int valueOf(){
        return startValue;
    }
    public void increment(){
        startValue++;
    }
    public void decrement(){
        startValue--;
    }

    public void increment(int increaseBy){
        if (increaseBy < 0){
            increaseBy = 0;
        } else {
            startValue += increaseBy;
        }

    }
    public void decrement(int decreaseBy){
        if (decreaseBy < 0){
            decreaseBy = 0;
        } else {
            startValue -= decreaseBy;
        }
    }

}

