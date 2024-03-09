package com.example.Quiz2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quiz {

    @Id

    private Long gamepin;
    private  String nickname;

    public Long getGamepin() {
        return gamepin;
    }

    public void setGamepin(Long gamepin) {
        this.gamepin = gamepin;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
