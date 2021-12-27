package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int countAttempts;
    private int[] nums;

    public Player(String name) {
        this.name = name;
        nums = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, countAttempts);
    }

    public void setNum(int newNumber) {
        nums[countAttempts] = newNumber;
        countAttempts++;
    }

    public void clearNumbers() {
        if (countAttempts > 0) {
            Arrays.fill(nums, 0, countAttempts, 0);
            countAttempts = 0;
        }
    }
}