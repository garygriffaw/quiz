package com.garygriffaw.quiz;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        String[] choices = {"a. 11", "b. 2", "c. 1"};
        Question question1 = new MultipleChoice("What is 1 + 1?", choices, "b");
        quiz.addQuestion(question1);

        Question question2 = new TrueFalse("Is 3 > 2?", true);
        quiz.addQuestion(question2);

        String[] choices3 = {"a. 11", "b. 2", "c. 1"};
        String[] answers3 = {"a", "b"};
        Question question3 = new Checkbox("Which are greater than 1?", choices3, answers3);
        quiz.addQuestion(question3);

        Question question4 = new ShortAnswer("What is the capital of Australia?", "Canberra");
        quiz.addQuestion(question4);

        quiz.displayQuestions();
    }
}
