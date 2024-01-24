package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String Testquote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a quote to get the character count");
        String quote = input.nextLine();

        char[] charactersInString = quote.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        int count = 1;

        for (int i=0; i<charactersInString.length; i++) {
            if (charCount.containsKey(charactersInString[i])) {
                count = charCount.get(charactersInString[i]);
                count++;
            } else {
                count = 1;
            }
            charCount.put(charactersInString[i], count);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

