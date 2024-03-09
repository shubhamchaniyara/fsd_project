package com.example.Quiz2.controller;

import com.example.Quiz2.model.Gamepin;
import com.example.Quiz2.model.Quiz;
import com.example.Quiz2.service.GameService;
import com.example.Quiz2.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class Gamecontro {

    private GameService gameService;

    @Autowired
    public Gamecontro(GameService gameService) {
        this.gameService = gameService;
    }
    @PostMapping("/gpin")
    public void saveQuizData(@RequestBody Gamepin gamepin) {
        gameService.saveQuiz(gamepin);
    }

    @GetMapping("/getpin")
    public List<Gamepin> getQuizData() {
        return gameService.getAllQuizzes();
    }

}
