package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        Boolean letsGo = true;
        while (letsGo) {
            System.out.print("Введите математическое выражение: ");
            calc.setExpression(sc.nextLine());

            int result = calc.calculate();
            System.out.println("Ответ: " + result);

            System.out.println("Хотите продолжить вычисления? введите yes");
            letsGo = sc.next().equals("yes");
            sc.nextLine();
        }
    }
}
