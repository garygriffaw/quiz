package com.garygriffaw.quiz;

public abstract class Question {
    private String question;
    protected boolean correctResponseProvided;

    public Question(String question) {
        this.question = question;
        this.correctResponseProvided = false;
    }

    public void displayQuestion() {
        System.out.println();
        System.out.println(question);
    }

    public abstract void checkResponse(String response);

    // Getters and Setters

    public String getQuestion() {
        return question;
    }

    public boolean isCorrectResponseProvided() {
        return correctResponseProvided;
    }
}
