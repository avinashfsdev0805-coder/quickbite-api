package com.quickbite.oop;

public class FoodItem extends MenuItem{

    public FoodItem(String name, double price){
        super(name, price);
    }

    @Override
    public String getItemType() {
        return "Food";
    }
}
