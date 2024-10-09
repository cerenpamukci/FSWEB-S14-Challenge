package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String chips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");
        this.chips = "Curvy";
        this.drink = "Coke";
    }

    public String getCips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        System.out.println("Added " + this.chips + " for an extra price.");
        System.out.println("Added " + this.drink + " for an extra price.");
        return hamburgerPrice;
    }
}