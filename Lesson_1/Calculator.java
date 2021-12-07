import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькурятор");
        System.out.println("Вводим число 1, вводим знак (+, -, *, /, ^, %), вводим 2 число");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое чилсо 1: ");
        int num1 = sc.nextInt();
        // This line you have to add (It consumes the \n character)
        sc.nextLine();

        System.out.print("Введие знак: ");
        String symbol = sc.nextLine();

        System.out.print("Введите целое чилсо 2: ");
        int num2 = sc.nextInt();

        //Сложение
        if (symbol.equals("+")) {
            System.out.println(num1+symbol+num2+"="+(num1+num2));
            //Вычетание
        } else if (symbol.equals("-")) {
            System.out.println(num1+symbol+num2+"="+(num1-num2));
            //Умножение
        } else if (symbol.equals("*")) {
            System.out.println(num1+symbol+num2+"="+(num1*num2));
            //Диление
        } else if (symbol.equals("/")) {
            System.out.println(num1+symbol+num2+"="+(num1/num2));
            //Возведение в степень
        } else if (symbol.equals("^")) {
            int result = 1;
            for (int i = 1; i < num2+1; i++) {
                result = result * num1;
            }
            System.out.println(num1+symbol+num2+"="+result);
            //Остаток от деления
        } else if (symbol.equals("%")) {
            double x;
            x = (double)num1 / (double)num2;
            System.out.println(num1+symbol+num2+"="+ (x % 1));
            // если ввели неверный знак, предупреждение
        } else {
            System.out.println("Ошибка. Ввели неверные данные!");
        }
    }
}

