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
        init();
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

    private void init() {
        hiddenNumber = getRundomNumber();
        firstPlayer.clearNumbers();
        secondPlayer.clearNumbers();
    }

    private int getRundomNumber() {
        int startRange = 0;
        int endRange = 100;
        return startRange + (int) (Math.random() * endRange);
    }

    private boolean makeMove(Player player) {
        System.out.println("Ход: " + player.getName());
        System.out.print(player.getName() + " называет число: ");
        int num = sc.nextInt();
        player.setNum(num);

        if (num == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + num + " с " + player.getCountAttempts() + " попытки");
            return true;
        }
        String answer = num > hiddenNumber ?  player.getName() + " число больше"  : player.getName() + " число меньше";
        System.out.println("Введенное " + answer + " того, что загадал компьютер!");

        if (player.getCountAttempts() == 10) {
            System.out.println(player.getName() + "У " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void outputNumbers(Player thisPlayer) {
        System.out.println();

        System.out.print(thisPlayer.getName() + " вводил числа");
        for (int num : thisPlayer.getNums()) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}