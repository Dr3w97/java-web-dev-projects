package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            double radius;
            boolean positive = true;
        do {
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();
            if (radius < 1) {
                System.out.println("Please enter a positive number");
                positive = false;
            } else {
                positive = true;
            }
        }
        while (positive == false);


        double area = Circle.getArea(radius);

        input.close();
        System.out.println("The area of a circle with the radius of " + radius + " is : " + area + ".");
    }
}
