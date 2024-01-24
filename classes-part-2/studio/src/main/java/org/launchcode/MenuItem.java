package org.launchcode;

import java.time.LocalDate;
import java.util.Date;


public class MenuItem {
    private String dishName;
    private String description;
    private double price;
    private String category;
    private boolean isNew = false;
    private final LocalDate dateAdded;


    public MenuItem(String dishName, String description, double price, String category, boolean isNew, LocalDate dateAdded) {
        this.dishName = dishName;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = dateAdded;
    }
    public MenuItem(String dishName, String description, double price, String category, boolean isNew) {
        this(dishName, description, price, category, isNew, LocalDate.now());
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    //print menu item
    @Override
    public String toString() {
        return dishName + "\n" +
                description + "\n" +
                "$" + price + "\n";
    }
}



