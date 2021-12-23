package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int sizeArrays = 0;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getSizeArrays() {
        return sizeArrays;
    }

    public int[] getHiddenNumbers() {
        return numbers;
    }

    public void setHiddenNumbers(int number) {
        numbers[this.sizeArrays] = number;
        this.sizeArrays++;
    }

    public void setUpPlayers() {
        if (sizeArrays > 0) {
            Arrays.fill(numbers, 0, sizeArrays, 0);
        }
    }
}