package com.garygriffaw.quiz;

public class MultipleChoice extends Question{
    private String[] choices;
    private String correctResponse;

    public MultipleChoice(String question, String[] choices, String correctResponse) {
        super(question);
        this.choices = choices;
        this.correctResponse = correctResponse.toLowerCase();
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        for (String choice : choices)
            System.out.println(choice);
        System.out.println("Type your choice:");
    }

    @Override
    public void checkResponse(String response) {
        if (response.toLowerCase().equals(correctResponse)) {
            System.out.println("Correct");
            correctResponseProvided = true;
        }
        else
            System.out.println("Sorry, '" + response + "' is incorrect");
    }

}
