package com.company;

public class Queen extends Character{

    public void fight() {

        System.out.println("I am your Queen");
    }

    public Queen() {

        weaponBehavior = new BowAndArrowBehavior();
    }

    public void display() {

        System.out.println("My weapons are ready");
    }

    @Override
    public void weaponBehavior() {

    }
}
