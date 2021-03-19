package com.garygriffaw.quiz;

public class ShortAnswer extends Question {
    private String correctResponse;

    public ShortAnswer(String question, String correctResponse) {
        super(question);
        this.correctResponse = correctResponse.toLowerCase();
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        System.out.println("Type your response (max 80 characters):");
    }

    @Override
    public void checkResponse(String response) {
        if (response.length() > 80) {
            System.out.println("Your response is too long");
            return;
        }

        if (response.toLowerCase().equals(correctResponse)) {
            System.out.println("Correct");
            correctResponseProvided = true;
        }
        else
            System.out.println("Sorry, '" + response + "' is incorrect");

    }
}
