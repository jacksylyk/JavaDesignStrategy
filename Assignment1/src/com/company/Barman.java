package com.company;

public class Barman extends Pub{

    public Barman(Drinking drinking) {
        super(new NotDrinking());
    }

    @Override
    public void display() {
        System.out.println("I am a barman");
    }
}
