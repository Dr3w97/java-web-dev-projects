import java.util.ArrayList;
import java.util.HashMap;

public class MultipleChoice extends questions {

    private ArrayList<String>choices = new ArrayList<>();

    public MultipleChoice(String question, String response, String answer, ArrayList choices ) {

        super(question, response, answer);
        this.choices = choices;

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }
}
