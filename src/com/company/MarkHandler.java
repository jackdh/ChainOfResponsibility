package com.company;


public abstract class MarkHandler {
    int mark;
    MarkHandler nextChecker;

    public void setNextHandler(MarkHandler m) {
        this.nextChecker = m;
    }

    public abstract String generateMark(int Score);

}
