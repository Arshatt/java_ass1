package com.company;

public class Troll extends Character{

    public void fight() {

        System.out.println("Let's fight right here");
    }

    public Troll () {

        weaponBehavior = new AxeBehavior();
    }

    public void display() {

        System.out.println("You dont stand a chance");
    }

    @Override
    public void weaponBehavior() {

    }
}
