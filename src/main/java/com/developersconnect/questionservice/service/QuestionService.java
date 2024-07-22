package com.developersconnect.questionservice.service;

import com.developersconnect.questionservice.model.Question;

import java.util.List;

public interface QuestionService {
    Question create(Question question);
    List<Question> get();
    Question getById(Long id);
    List<Question> getQuestionsByQuizId(Long quizId);
}
