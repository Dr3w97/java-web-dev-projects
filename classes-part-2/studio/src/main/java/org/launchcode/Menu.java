package org.launchcode;

import java.util.ArrayList;

public class Menu {
    ArrayList<ArrayList <MenuItem>> fullMenu  = new ArrayList<>();

    ArrayList<MenuItem> appetizer = new ArrayList<>();
    ArrayList<MenuItem> entre = new ArrayList<>();
    ArrayList<MenuItem> dessert = new ArrayList<>();

    public Menu() {
        fullMenu.add(appetizer);
        fullMenu.add(entre);
        fullMenu.add(dessert);
    }

    public void setDishes(ArrayList<MenuItem> dishes) {
        this.fullMenu = fullMenu;
    }
    public void addDish(MenuItem dish) {
        if (dish.getCategory() == "Appetizer") {
        appetizer.add(dish);
        } else if (dish.getCategory() == "Entre") {
            entre.add(dish);
        }else {
            dessert.add(dish);
        }
    }
    public void removeDish(MenuItem dish) {
        fullMenu.remove(dish);
    }


    @Override
    public String toString() {
        StringBuilder menuString = new StringBuilder();
        menuString.append("Appetizer: \n");
        for (MenuItem item : appetizer) {
            menuString.append(item);
        }
        menuString.append("\nEntre: \n");
        for (MenuItem item : entre) {
            menuString.append(item);
        }
     menuString.append("\nDessert: \n");
        for (MenuItem item : dessert) {
            menuString.append(item);
        }

        return menuString.toString();
    }
}





