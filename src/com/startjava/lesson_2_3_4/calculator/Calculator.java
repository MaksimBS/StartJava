package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private int num1;
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    private int num2;
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    private char mathSign;
    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public void setExpression(String expression) {
        String[] parts = expression.split(" ");

        try {
            num1 = Integer.parseInt(parts[0]);
            if (num1 < 0) {
                errorProcessing();
            }
        }
        catch (NumberFormatException nfe) {
            errorProcessing();
        }

        try {
            num2 = Integer.parseInt(parts[2]);
            if (num2 < 0) {
                errorProcessing();
            }
        }
        catch (NumberFormatException nfe) {
            errorProcessing();
        }

        try {
            mathSign = parts[1].charAt(0);
        }
        catch (NumberFormatException nfe) {
            errorProcessing();
        }
    }

    private void errorProcessing() {
        System.out.println("Ошибка формата ввода выражения! Пример 2 * 5, целые положительные числа");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        setExpression(sc.nextLine());
    }

    public int calculate() {
        int result =0;

        switch (mathSign) {
            case '+' -> result = num1 + num2;
            case '-' -> result = Math.subtractExact(num1, num2);
            case '*' -> result = Math.multiplyExact(num1, num2);
            case '/' -> result = num1 / num2;
            case '^' -> result = (int) Math.pow(num1, num2);
            case '%' -> result = (num1 % num2);
            default -> System.out.println("Ошибка. Ввели неверные данные!");
        }
        return result;
    }
}