package com.company;

public class Main {

    public static void main(String[] args) {
        MarkHandler first = new First();
        MarkHandler twoOne = new TwoOne();
        MarkHandler third = new Third();

        first.setNextHandler(twoOne);
        twoOne.setNextHandler(third);

        System.out.println(first.generateMark(0));
        // Prints The Student got a third overall!
        System.out.println(first.generateMark(65));
        // Prints The Student got a Two One overall!
        System.out.println(first.generateMark(71));
        // Prints The Student got a First overall!

    }
}
