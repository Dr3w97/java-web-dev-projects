package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem chxTaco = new MenuItem("Chicken taco", "tacos full of chicken", 1, "Appetizer", false);
        MenuItem spaghetti = new MenuItem("Spaghetti", "Spaghetti noodles with a meat sauce", 12, "Entre", false);
        MenuItem cesarSal = new MenuItem("Cesar Salad", "Romane Lettuce with parmesan cheese, crispy croutons, and ceaser dressing", 6, "Appetizer", false);
        MenuItem cheeseCake = new MenuItem("Cheesecake", "New York style Cheesecake with raspeberry swirls", 7, "Dessert", false);

        Menu drewsRestraunt = new Menu();

        drewsRestraunt.addDish(chxTaco);
        drewsRestraunt.addDish(spaghetti);
        drewsRestraunt.addDish(cesarSal);
        drewsRestraunt.addDish(cheeseCake);

//        for (int i = 0; i < drewsRestraunt.fullMenu.size(); i++) {
//            for (MenuItem dish : drewsRestraunt.fullMenu.get(i)) {
////            System.out.println(dishes.getDishName());
////            System.out.println(dishes.getDescription());
////            System.out.println(dishes.getCategory());
////            System.out.println(dishes.getPrice());
////            System.out.println(dishes.isNew());
////            System.out.println(dishes.getDateAdded());
////            System.out.println("\n");
//                System.out.println(dish);
//            }
//        }
        System.out.println(drewsRestraunt);
    }
}
