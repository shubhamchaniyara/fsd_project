package com.example.Quiz2.controller;


import com.example.Quiz2.model.Gamepin;
import com.example.Quiz2.model.Quiz;
import com.example.Quiz2.repository.Quizrepo;
import com.example.Quiz2.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class Quizcontro {
    private QuizService quizService;

    @Autowired
    public Quizcontro(QuizService quizService) {
        this.quizService = quizService;
    }
    @PostMapping("/tquiz")
    public void saveQuizData(@RequestBody Quiz quiz) {
        quizService.saveQuiz(quiz);
    }

    @GetMapping("/QuizPlay")
    public List<Quiz> getQuizData() {
        return quizService.getAllQuizzes();
    }

}
