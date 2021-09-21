package com.company;

public class Visitor extends Pub{
    public Visitor(Drinking drinking) {
        super(new DrinkBeer());
    }

    @Override
    public void display() {
        System.out.println("I am a visitor");
    }
}
