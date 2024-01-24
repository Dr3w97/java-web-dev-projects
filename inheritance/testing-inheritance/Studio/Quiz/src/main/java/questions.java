public abstract class questions {

    private static String question;
    private static String response;
    private static String answer;

    public questions(String question, String response, String answer) {
        this.question = question;
        this.response = response;
        this.answer = answer;
    }

    public static void setQuestion(String question) {
        questions.question = question;
    }

    public static void setResponse(String response) {
        questions.response = response;
    }

    public static void setAnswer(String answer) {
        questions.answer = answer;
    }

    public static String getQuestion() {
        return question;
    }

    public static String getResponse() {
        return response;
    }

    public static String getAnswer() {
        return answer;
    }
}
