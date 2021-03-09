package ru.otus.spring.domain;

import com.opencsv.bean.CsvBindAndJoinByName;
import com.opencsv.bean.CsvBindAndJoinByPosition;
import com.opencsv.bean.CsvBindByName;
import org.apache.commons.collections4.MultiValuedMap;

public class Question {

    @CsvBindByName(column = "Question", required = true)
    private String text;

    @CsvBindAndJoinByName(column = "Option.*", elementType = String.class)
    private MultiValuedMap<String, String> options;

    @CsvBindByName(column = "Open Question")
    private boolean isOpen;

    @CsvBindByName(column = "Correct Answer")
    private int correctAnswer;

    public String getText() {
        return text;
    }

    public MultiValuedMap<String, String> getOptions() {
        return options;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
