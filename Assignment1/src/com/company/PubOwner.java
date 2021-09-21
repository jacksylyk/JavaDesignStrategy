package com.company;

public class PubOwner extends Pub{


    public PubOwner() {
        super(new DrinkWhiskey());
    }

    @Override
    public void display() {
        System.out.println("I am a pub owner");
    }
}
