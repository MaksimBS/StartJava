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
        clearPlayerNums();
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

    private void clearPlayerNums() {
        firstPlayer.clearNumber();
        secondPlayer.clearNumber();
    }

    private int getRundomNumber() {
        int startRange = 0;
        int endRange = 100;
        return startRange + (int) (Math.random() * endRange);
    }

    private boolean makeMove(Player nextPlayer) {
        System.out.println("Ход: " + nextPlayer.getName());
        System.out.print(nextPlayer.getName() + " называет число: ");
        int num = sc.nextInt();
        nextPlayer.setNum(num);

        if (num == hiddenNumber) {
            System.out.println("Игрок " + nextPlayer.getName() + " угадал число " + num + " с " + nextPlayer.getCountAttempts() + " попытки");
            return true;
        }
        String securityAnswer = num > hiddenNumber ? "Введенное " + nextPlayer.getName() + " число больше того, что загадал компьютер!" : "Введенное " + nextPlayer.getName() + " число меньше того, что загадал компьютер!";
        System.out.println(securityAnswer);

        if (nextPlayer.getCountAttempts() == 10) {
            System.out.println(nextPlayer.getName() + "У " + nextPlayer.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void outputNumbers(Player thisPlayer) {
        System.out.println();

        System.out.print(thisPlayer.getName() + " вводил числа");
        for (int num : thisPlayer.getNum()) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}