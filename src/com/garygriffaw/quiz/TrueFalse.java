package com.garygriffaw.quiz;

public class TrueFalse extends Question {
    private boolean correctResponse;

    public TrueFalse(String question, boolean correctResponse) {
        super(question);
        this.correctResponse = correctResponse;
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        System.out.println("Type 'True' or 'False':");
    }

    @Override
    public void checkResponse(String response) {
        String lowercaseResponse = response.toLowerCase();
        boolean booleanResponse;

        if (lowercaseResponse.equals("true") || lowercaseResponse.equals("t"))
            booleanResponse = true;
        else if (lowercaseResponse.equals("false") || lowercaseResponse.equals("f"))
            booleanResponse = false;
        else {
            System.out.println("Invalid response");
            return;
        }

        if (booleanResponse == correctResponse) {
            System.out.println("Correct");
            correctResponseProvided = true;
        }
        else
            System.out.println("Sorry, '" + response + "' is incorrect");

    }
}
