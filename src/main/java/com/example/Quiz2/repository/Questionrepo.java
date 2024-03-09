package com.example.Quiz2.repository;

import com.example.Quiz2.model.QueDto;
import com.example.Quiz2.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Questionrepo extends JpaRepository<QueDto,Integer> {
}
