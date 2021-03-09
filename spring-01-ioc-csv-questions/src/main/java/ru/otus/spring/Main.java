package ru.otus.spring;

import com.opencsv.exceptions.CsvValidationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.repository.Questions;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        Questions questionsReader = context.getBean(Questions.class);

        questionsReader.print();

        context.close();
    }
}
