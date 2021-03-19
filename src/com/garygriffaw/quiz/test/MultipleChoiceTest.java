package com.garygriffaw.quiz.test;

import com.garygriffaw.quiz.MultipleChoice;
import com.garygriffaw.quiz.Question;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultipleChoiceTest {

    @Test
    public void correctLowercaseResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        Question question = new MultipleChoice("What is 1 + 1?", choices, "b");
        String response = "b";
        question.checkResponse(response);
        assertTrue(question.isCorrectResponseProvided());
    }

    @Test
    public void correctUppercaseResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        Question question = new MultipleChoice("What is 1 + 1?", choices, "b");
        String response = "B";
        question.checkResponse(response);
        assertTrue(question.isCorrectResponseProvided());
    }

    @Test
    public void incorrectResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        Question question = new MultipleChoice("What is 1 + 1?", choices, "b");
        String response = "c";
        question.checkResponse(response);
        assertFalse(question.isCorrectResponseProvided());
    }

    @Test
    public void incorrectInvalidResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        Question question = new MultipleChoice("What is 1 + 1?", choices, "b");
        String response = "d";
        question.checkResponse(response);
        assertFalse(question.isCorrectResponseProvided());
    }

    @Test
    public void incorrectTooManyResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        Question question = new MultipleChoice("What is 1 + 1?", choices, "b");
        String response = "b c";
        question.checkResponse(response);
        assertFalse(question.isCorrectResponseProvided());
    }
}
