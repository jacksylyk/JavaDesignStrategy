package com.company;

public class NotDrinking implements Drinking{
    @Override
    public void drink() {
        System.out.println("I do not drink");
    }
}
