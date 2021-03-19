package com.garygriffaw.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void displayQuestions() {
        Scanner input = new Scanner(System.in);

        for (Question question : questions) {
            question.displayQuestion();
            String response = input.nextLine();
            question.checkResponse(response);
        }
    }

}
