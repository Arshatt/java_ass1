package com.company;

public class King extends Character{

    public void fight() {

        System.out.println("I'm your King!");
    }

    public King() {

        weaponBehavior = new KnifeBehavior();
    }

    public void display() {

        System.out.println("Bend the knee");
    }

    @Override
    public void weaponBehavior() {

    }
}
