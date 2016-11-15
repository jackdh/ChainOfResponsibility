package com.company;

public class TwoOne extends MarkHandler{

    @Override
    public String generateMark(int score) {
        if (score <60) {
            return nextChecker.generateMark(score);
        } else {
            return "The Student got a Two One overall!";
        }

    }
}
