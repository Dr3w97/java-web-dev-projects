import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    MultipleChoice question1 = new MultipleChoice("How many planets are in the solar system?", "", "9", new ArrayList<String>());
    question1.getChoices().add("1");
        question1.getChoices().add("8");
        question1.getChoices().add("3");
        question1.getChoices().add("9");

        System.out.println(question1.getQuestion() + " Please enter 1-4" + "\n" + question1.getChoices());
        question1.setResponse(input.nextLine());
        if (question1.getAnswer().equals(question1.getChoices().get(Integer.parseInt(question1.getResponse()) - 1))) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

    }

}



