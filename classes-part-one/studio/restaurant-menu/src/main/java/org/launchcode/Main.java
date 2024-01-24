package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //        this.dishName = dishName;
        //        this.description = description;
        //        this.price = price;
        //        this.category = category;
        //        this.isNew = isNew;
        //        this.dateAdded = dateAdded;
        MenuItem chxTaco = new MenuItem("Chicken taco", "tacos full of chicken", 1, "Appetizer", false);
        MenuItem spaghetti = new MenuItem("Spaghetti", "Spaghetti noodles with a meat sauce", 12, "Entre", false);
        MenuItem cesarSal = new MenuItem("Cesar Salad", "Romane Lettuce with parmesan cheese, crispy croutons, and ceaser dressing", 6, "Appetizer", false);
        MenuItem cheeseCake = new MenuItem("Cheesecake", "New York style Cheesecake with raspeberry swirls", 7, "Dessert", false);
        Menu drewsRestraunt = new Menu();
        drewsRestraunt.addDish(chxTaco);
        drewsRestraunt.addDish(spaghetti);
        drewsRestraunt.addDish(cesarSal);
        drewsRestraunt.addDish(cheeseCake);

        for (MenuItem dishes : drewsRestraunt.dishes) {
            System.out.println(dishes.getDishName());
            System.out.println(dishes.getDescription());
            System.out.println(dishes.getCategory());
            System.out.println(dishes.getPrice());
            System.out.println(dishes.isNew());
            System.out.println(dishes.getDateAdded());
            System.out.println("\n");

        }
    }
}
