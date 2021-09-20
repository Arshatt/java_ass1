package com.company;

public class Knight extends Character{

    public void fight() {

        System.out.println("Let's go");
    }

    public Knight() {

        weaponBehavior = new SwordBehavior();
    }

    public void display() {

        System.out.println("My name is William");
    }

    @Override
    public void weaponBehavior() {

        System.out.println("You will be destroyed");
    }
}
