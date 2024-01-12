package com.workintech.encapsulation;

public class Console {
    public static void main(String[] args) {
        Player eda = new Player("Eda", -100, Weapon.SWORD);
        Player ali = new Player("Ali", 1000, Weapon.AXE);

        System.out.println(eda);
        System.out.println(ali);

        System.out.println("*************************");

        eda.restoreHealth(100);
        eda.loseHealth(50);
        System.out.println(eda.healthRemaining());

        eda.loseHealth(60);
        System.out.println(eda.healthRemaining());

        eda.email = "ei@test.com";


    }
}