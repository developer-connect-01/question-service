package com.developersconnect.questionservice.service.impl;

import com.developersconnect.questionservice.model.Question;
import com.developersconnect.questionservice.repository.QuestionRepository;
import com.developersconnect.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository repository;

    @Override
    public Question create(Question question) {
        return repository.save(question);
    }

    @Override
    public List<Question> get() {
        return repository.findAll();
    }

    @Override
    public Question getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Question not found!!"));
    }

    @Override
    public List<Question> getQuestionsByQuizId(Long quizId) {
        return repository.findByQuizId(quizId);
    }
}
