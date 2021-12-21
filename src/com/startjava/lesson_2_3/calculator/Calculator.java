package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private double num1;
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    private double num2;
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    private char mathSign;
    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public double calculate() {
        double result =0;

        switch (mathSign) {
            case '+' :
                result =  num1 + num2;
                break;
            case '-' :
                result =  num1 - num2;
                break;
            case '*' :
                result =  num1 * num2;
                break;
            case '/' :
                result =  num1 / num2;
                break;
            case '^' :
                result = 1;
                for (int i = 1; i < num2 + 1; i++) {
                    result *= num1;
                }
                break;
            case '%' :
                result = (num1 / num2) % 1;
                break;
            default:
                System.out.println("Ошибка. Ввели неверные данные!");
                break;
        }
        return result;
    }
}