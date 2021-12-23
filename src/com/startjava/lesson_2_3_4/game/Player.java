package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number = 0;
    private int[] hiddenNumbers;

    public Player(String name) {
        this.name = name;
        hiddenNumbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setHiddenNumbers(int number) {
        hiddenNumbers[this.number] = number;
        this.number ++;
    }

    public void outputNumbers() {
        System.out.println();

        int [] numbersCopy = Arrays.copyOf(hiddenNumbers, number);
        System.out.println(name + " вводил числа " + Arrays.toString(numbersCopy));
    }

    public void cleanArrays() {
        if (number > 0) {
            Arrays.fill(hiddenNumbers, 0, number , 0);
        }
    }
}