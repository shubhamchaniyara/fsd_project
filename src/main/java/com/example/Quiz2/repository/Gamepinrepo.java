package com.example.Quiz2.repository;

import com.example.Quiz2.model.Gamepin;
import com.example.Quiz2.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Gamepinrepo extends JpaRepository<Gamepin, Integer> {

}
