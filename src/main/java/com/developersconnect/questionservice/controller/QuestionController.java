package com.developersconnect.questionservice.controller;

import com.developersconnect.questionservice.model.Question;
import com.developersconnect.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    private QuestionService service;

    @PostMapping
    public Question create(@RequestBody Question question){
        return service.create(question);
    }

    @GetMapping
    public List<Question> get(){
        return service.get();
    }

    @GetMapping("/{id}")
    public Question getById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuizId(@PathVariable Long quizId){
        return service.getQuestionsByQuizId(quizId);
    }
}
