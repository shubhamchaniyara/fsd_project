package com.example.Quiz2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Quiz2.model.Quiz;

public interface Quizrepo extends JpaRepository<Quiz,Long> {

}
