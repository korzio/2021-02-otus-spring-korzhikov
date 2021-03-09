package ru.otus.spring.repository;

import com.opencsv.bean.CsvToBeanBuilder;
import ru.otus.spring.domain.Question;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class QuestionsFileReader implements Questions {
    private List<Question> questions;

    public QuestionsFileReader(String file) throws IOException {
        var input = getClass().getClassLoader().getResourceAsStream(file);

        this.questions = new CsvToBeanBuilder(new InputStreamReader(input, "UTF-8"))
                .withType(Question.class).build().parse();
    }

    public List<Question> getAll() {
        return questions;
    }

    public void print() {
        var iterator = questions.iterator();
        for (var it = iterator; it.hasNext();) {
            // skip header
            var question = it.next();

            System.out.println("question: " + question.getText() + " options: " + question.getOptions().values());
        }
    }
}
