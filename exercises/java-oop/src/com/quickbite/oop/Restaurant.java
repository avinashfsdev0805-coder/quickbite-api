package com.quickbite.oop;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private final List<MenuItem> menu = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addMenuItem(MenuItem item){
        menu.add(item);
    }

    public void displayMenu(){
        System.out.println("Menu at " + name);

        for(MenuItem item: menu){
            System.out.println(item.getName() +" | Rs."+ item.getPrice()+ " | "+ item.getItemType());
        }
    }
}
