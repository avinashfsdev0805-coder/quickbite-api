package com.quickbite.menu;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "menu_items")
public class MenuItem {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length =100)
    private String name;

    @Column(nullable = false, precision=10 , scale= 2 )
    private BigDecimal price;

    @Column(nullable=false, length=100)
    private String category;

    @Column(nullable=false)
    private boolean available= true;

    // Required by JPA: allows Hibernate to instantiate
    // MenuItem entities when loading records from the database.
    protected MenuItem() {
    }

    public MenuItem(String name, BigDecimal price, String category){
        this.name=name;
        setPrice(price);
        this.category=category;
        this.available=true;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name == null || name.isBlank()) {
           throw new IllegalArgumentException("Name is required");
        }
        this.name = name;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setPrice(BigDecimal newPrice){
        if(newPrice ==null || newPrice.compareTo(BigDecimal.ZERO ) < 0 ){
            throw new IllegalArgumentException("Price cannot be null or negative");
        }
        
        this.price = newPrice; 
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String newCategory){
        if (newCategory == null || newCategory.isBlank()) {
           throw new IllegalArgumentException("Category is required");
        }
        this.category = newCategory;
    }
    
    public boolean isAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available= available;
    }
}


