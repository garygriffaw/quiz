package com.garygriffaw.quiz.test;

import com.garygriffaw.quiz.Checkbox;
import com.garygriffaw.quiz.Question;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckboxTest {

    @Test
    public void correctLowercaseResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        String[] answers = {"a", "b"};
        Question question = new Checkbox("Which are greater than 1?", choices, answers);
        String response = "a b";
        question.checkResponse(response);
        assertTrue(question.isCorrectResponseProvided());
    }

    @Test
    public void correctUppercaseResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        String[] answers = {"a", "b"};
        Question question = new Checkbox("Which are greater than 1?", choices, answers);
        String response = "A B";
        question.checkResponse(response);
        assertTrue(question.isCorrectResponseProvided());
    }

    @Test
    public void incorrectPartialResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        String[] answers = {"a", "b"};
        Question question = new Checkbox("Which are greater than 1?", choices, answers);
        String response = "a";
        question.checkResponse(response);
        assertFalse(question.isCorrectResponseProvided());
    }

    @Test
    public void incorrectResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        String[] answers = {"a", "b"};
        Question question = new Checkbox("Which are greater than 1?", choices, answers);
        String response = "c";
        question.checkResponse(response);
        assertFalse(question.isCorrectResponseProvided());
    }

    @Test
    public void incorrectPlusCorrectResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        String[] answers = {"a", "b"};
        Question question = new Checkbox("Which are greater than 1?", choices, answers);
        String response = "a b c";
        question.checkResponse(response);
        assertFalse(question.isCorrectResponseProvided());
    }

    @Test
    public void incorrectInvalidResponse() {
        String[] choices = {"a. 11", "b. 2", "c. 1"};
        String[] answers = {"a", "b"};
        Question question = new Checkbox("Which are greater than 1?", choices, answers);
        String response = "d";
        question.checkResponse(response);
        assertFalse(question.isCorrectResponseProvided());
    }
}
