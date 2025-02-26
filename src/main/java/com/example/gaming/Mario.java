package com.example.gaming;

import org.springframework.stereotype.Component;

@Component
public class Mario implements Game {
    @Override
    public void up() {
        System.out.println("Mario jumps up");
    }

    @Override
    public void down() {
        System.out.println("Mario goes down");
    }

    @Override
    public void left() {
        System.out.println("Mario moves left");
    }

    @Override
    public void right() {
        System.out.println("Mario moves right");
    }
}
