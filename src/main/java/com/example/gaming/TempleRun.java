package com.example.gaming;

import org.springframework.stereotype.Component;

@Component
public class TempleRun implements Game {
    @Override
    public void up() {
        System.out.println("TempleRun jumps up");
    }

    @Override
    public void down() {
        System.out.println("TempleRun slides down");
    }

    @Override
    public void left() {
        System.out.println("TempleRun moves left");
    }

    @Override
    public void right() {
        System.out.println("TempleRun moves right");
    }
}
