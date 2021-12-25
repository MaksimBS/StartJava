package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int countAttempts;
    private int[] num;

    public Player(String name) {
        this.name = name;
        num = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int[] getNum() {
        return Arrays.copyOf(num, countAttempts);
    }

    public void setNum(int newNumber) {
        num[countAttempts] = newNumber;
        countAttempts++;
    }

    public void clearNumber() {
        if (countAttempts > 0) {
            Arrays.fill(num, 0, countAttempts, 0);
            countAttempts = 0;
        }
    }
}