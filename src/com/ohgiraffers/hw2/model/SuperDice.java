package com.ohgiraffers.hw2.model;

import java.util.Random;

public class SuperDice extends Dice {
    int min;
    int max;

    public SuperDice() {
        min = 1;
        max = 10;
    }

    @Override
    public int getNumber() {
        return (int) (Math.random() * max) + min;
    }
}
