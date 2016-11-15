package com.company;

public class First extends MarkHandler{

    @Override
    public String generateMark(int score) {
        if (score <70) {
            return nextChecker.generateMark(score);
        } else {
            return "The Student got a First overall!";
        }

    }
}
