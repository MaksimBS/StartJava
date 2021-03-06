package com.startjava.lesson_1.calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькурятор");
        System.out.println("Вводим число 1, вводим знак (+, -, *, /, ^, %), вводим 2 число");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nВведите целое чилсо 1: ");
        int num1 = sc.nextInt();
        // This line you have to add (It consumes the \n character)
        sc.nextLine();

        System.out.print("Введие знак: ");
        String mathSign = sc.nextLine();

        System.out.print("Введите целое чилсо 2: ");
        int num2 = sc.nextInt();
        int result = 0;
        
        if (mathSign.equals("+")) {
            result = num1 + num2;
        } else if (mathSign.equals("-")) {
            result = num1 - num2;
        } else if (mathSign.equals("*")) {
            result = num1 * num2;
        } else if (mathSign.equals("/")) {
            result = num1 / num2;
        } else if (mathSign.equals("^")) {
            result = 1;
            for (int i = 1; i < num2 + 1; i++) {
                result *= num1;
            }
        } else if (mathSign.equals("%")) {
            result = num1 - num2 * (num1 / num2);
        } else {
            System.out.println("Ошибка. Ввели неверные данные!");
        }
        System.out.println(num1 + mathSign + num2 + "=" + result);
    }
}

