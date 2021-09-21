package com.company;

public abstract class Pub {
    private Drinking drinking;

    public Pub(Drinking drinking ) {
        this.drinking = drinking;
    }


    public void performDrink() {
        this.drinking.drink();
    }
    public abstract void display();

    public Drinking getDrinking() {
        return drinking;
    }

    public void setDrinking(Drinking drinking) {
        this.drinking = drinking;
    }
}
