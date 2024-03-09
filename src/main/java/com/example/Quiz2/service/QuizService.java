package com.example.Quiz2.service;

import com.example.Quiz2.model.Quiz;
import com.example.Quiz2.repository.Quizrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuizService {

    private final Quizrepo quizRepository;

    @Autowired
    public QuizService(Quizrepo quizRepository) {
        this.quizRepository = quizRepository;
    }

    public void saveQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }
}
