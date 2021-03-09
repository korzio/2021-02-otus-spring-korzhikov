package ru.otus.spring.repository;

import ru.otus.spring.domain.Question;

import java.util.List;

public interface Questions {
    List<Question> getAll();

    void print();
}
