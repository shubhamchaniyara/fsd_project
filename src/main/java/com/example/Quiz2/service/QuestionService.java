package com.example.Quiz2.service;


import com.example.Quiz2.model.QueDto;
import com.example.Quiz2.model.Quiz;
import com.example.Quiz2.repository.Questionrepo;
import com.example.Quiz2.repository.Quizrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final Questionrepo questionrepo;

    @Autowired
    public QuestionService(Questionrepo questionrepo) {
        this.questionrepo = questionrepo;
    }

    public void saveQuiz(QueDto queDto) {
        questionrepo.save(queDto);
    }

    public List<QueDto> getAllQuizzes() {
        return questionrepo.findAll();
    }
}
