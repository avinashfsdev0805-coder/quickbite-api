package com.quickbite.oop;

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name , double price){
        if(name == null || name.isBlank()){
            throw  new IllegalArgumentException("Name cannot be null or blank");
        }
        if(price < 0){
            throw  new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        if(newPrice<0){
            throw  new IllegalArgumentException("Price cannot be negative");
        }else{
            this.price = newPrice;
        }
    }

    public String getItemType(){
        return "GeneralItem";
    }
}
