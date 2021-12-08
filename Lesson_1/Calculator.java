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

        if (mathSign.equals("+")) {
            System.out.println(num1 + mathSign + num2 + "=" + (num1 + num2));
        } else if (mathSign.equals("-")) {
            System.out.println(num1 + mathSign + num2 + "=" + (num1 - num2));
        } else if (mathSign.equals("*")) {
            System.out.println(num1 + mathSign + num2 + "=" + (num1 * num2));
        } else if (mathSign.equals("/")) {
            System.out.println(num1 + mathSign + num2 + "=" + (num1 / num2));
        } else if (mathSign.equals("^")) {
            int result = 1;
            for (int i = 1; i < num2 + 1; i++) {
                result *= num1;
            }
            System.out.println(num1 + mathSign + num2 + "=" + result);
        } else if (mathSign.equals("%")) {
            double x;
            x = (double) num1 / (double) num2;
            System.out.println(num1 + mathSign + num2 + "=" + (x % 1));
        } else {
            System.out.println("Ошибка. Ввели неверные данные!");
        }
    }
}

