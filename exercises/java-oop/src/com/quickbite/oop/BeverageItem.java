package com.quickbite.oop;

public class BeverageItem extends MenuItem{

    public BeverageItem(String name, double price){
        super(name, price);
    }

    @Override
    public String getItemType() {
        return "Beverage";
    }
}
