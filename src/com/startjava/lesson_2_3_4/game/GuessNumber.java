package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        cleaningPlayers();
        hiddenNumber = getRundomNumber();
        System.out.println("Компьютер загодал число от 0 до 100. Начинайте угадывать.");

        do {
            //Пробует отгадать первый игрок
            if (makeMove(firstPlayer)) {
                break;
            }
            //Пробует отгадать второй игрок
            if (makeMove(secondPlayer)) {
                break;
            }
        } while (true);

        outputNumbers(firstPlayer);
        outputNumbers(secondPlayer);
    }

    private void cleaningPlayers() {
        firstPlayer.setUpPlayers();
        secondPlayer.setUpPlayers();
    }

    private int getRundomNumber() {
        int startRange = 0;
        int endRange = 100;
        return startRange + (int) (Math.random() * endRange);
    }

    private boolean makeMove(Player nextPlayer) {
        System.out.println("Ход: " + nextPlayer.getName());
        System.out.print(nextPlayer.getName() + " называет число: ");
        int number = sc.nextInt();
        nextPlayer.setHiddenNumbers(number);
        if (number > hiddenNumber) {
            System.out.println("Введенное " + nextPlayer.getName() + " число больше того, что загадал компьютер!");
        } else if (number < hiddenNumber) {
            System.out.println("Введенное " + nextPlayer.getName() + " число меньше того, что загадал компьютер!");
        } else {
            System.out.println("Игрок " + nextPlayer.getName() + " угадал число " + number + " с " + nextPlayer.getSizeArrays() + " попытки");
            return true;
        }

        if (nextPlayer.getSizeArrays() == 10) {
            System.out.println(nextPlayer.getName() + "У " + nextPlayer.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void outputNumbers(Player thisPlayer) {
        System.out.println();

        int[] numbersCopy = Arrays.copyOf(thisPlayer.getHiddenNumbers(), thisPlayer.getSizeArrays());
        System.out.println(thisPlayer.getName() + " вводил числа " + Arrays.toString(numbersCopy));
    }
}