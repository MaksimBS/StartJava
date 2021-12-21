package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player firstPlayer = new Player(sc.nextLine());

        System.out.println("Введите имя второго игрока: ");
        Player secondPlayer = new Player(sc.nextLine());

        GuessNumber game = new GuessNumber(firstPlayer,secondPlayer);

        String nextTurn = "yes";
        while (nextTurn.equals("yes")) {
            game.start();
            do {
                System.out.println("Хотите продолжить? [yes/no]: ");
                nextTurn = sc.next();
            } while (!nextTurn.equals("yes") && !nextTurn.equals("no"));
        }
    }
}