package com.startjava.lesson_2_3_4.game;

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

        outputNumbers();
    }

    public void cleaningPlayers() {
        firstPlayer.cleanArrays();
        secondPlayer.cleanArrays();
    }

    private int getRundomNumber() {
        int startRange = 0;
        int endRange = 100;
        return startRange + (int) (Math.random() * endRange);
    }

    private boolean makeMove(Player nextPlayer) {
        int number;
        System.out.println("Ход: " + nextPlayer.getName());
        System.out.print(nextPlayer.getName() + " называет число: ");
        number = sc.nextInt();
        nextPlayer.setHiddenNumbers(number);
        if (number > hiddenNumber) {
            System.out.println("Введенное " + nextPlayer.getName() + " число больше того, что загадал компьютер!");
        } else if (number < hiddenNumber) {
            System.out.println("Введенное " + nextPlayer.getName() + " число меньше того, что загадал компьютер!");
        } else {
            System.out.println("Игрок " + nextPlayer.getName() + " угадал число " + number + " с " + nextPlayer.getNumber() + " попытки");
            return true;
        }

        if (nextPlayer.getNumber() == 10) {
            System.out.println(nextPlayer.getName() + "У " + nextPlayer.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    public void outputNumbers() {
        firstPlayer.outputNumbers();
        secondPlayer.outputNumbers();
    }
}