package org.launchcode;

import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> dishes = new ArrayList<>();

    public void setDishes(ArrayList<MenuItem> dishes) {
        this.dishes = dishes;
    }
    public void addDish(MenuItem dish) {
        dishes.add(dish);
    }
    public void removeDish(MenuItem dish) {
        dishes.remove(dish);
    }
}
