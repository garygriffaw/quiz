package com.garygriffaw.quiz;

import java.util.Arrays;

public class Checkbox extends Question {
    private String[] choices;
    private String[] correctResponses;

    public Checkbox(String question, String[] choices, String[] correctResponses) {
        super(question);
        this.choices = choices;
        this.correctResponses = correctResponses;
        for (int i = 0; i < correctResponses.length; i++)
            correctResponses[i] = correctResponses[i].toLowerCase();
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        for (String choice : choices)
            System.out.println(choice);
        System.out.println("Type your choice(s) separated by a space:");
    }

    @Override
    public void checkResponse(String response) {
        String[] responses = response.toLowerCase().split(" ");

        Arrays.sort(responses);
        Arrays.sort(correctResponses);

        if (Arrays.deepEquals(responses, correctResponses)) {
            System.out.println("Correct");
            correctResponseProvided = true;
        }
        else
            System.out.println("Sorry, '" + response + "' is incorrect");
    }
}
