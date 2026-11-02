package com.quickbite.oop;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Krisha's Benne||Benne House");

        MenuItem benneDosa = new FoodItem("Benne Dosa", -80);
        MenuItem benneMasala= new FoodItem("Benne Masala Dosa", 100);
        MenuItem bennePodiDosa = new FoodItem("Benne Podi  Dosa", 100);
        MenuItem bennePodiMasalaDosa = new FoodItem("Benne Podi Masala Dosa", 120);

        MenuItem filterCoffee = new BeverageItem("Filter Coffee", 20);
        MenuItem tea = new BeverageItem("Chai", 20);

        restaurant.addMenuItem(benneDosa);
        restaurant.addMenuItem(benneMasala);
        restaurant.addMenuItem(bennePodiDosa);
        restaurant.addMenuItem(bennePodiMasalaDosa);
        restaurant.addMenuItem(filterCoffee);
        restaurant.addMenuItem(tea);

        restaurant.displayMenu();
    }
}
