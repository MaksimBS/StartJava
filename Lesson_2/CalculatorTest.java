import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        Boolean letsGo = true;
        while (letsGo) {
            System.out.print("Введите первое число: ");
            calc.setNum1(sc.nextDouble());
            sc.nextLine();

            System.out.print("Введите знак математической операции: ");
            calc.setMathSign(sc.next().charAt(0));

            System.out.print("Введите второе число: ");
            calc.setNum2(sc.nextDouble());

            double result = calc.calculate();
            System.out.println("Ответ: " + result);

            System.out.println("Хотите продолжить вычисления? [yes/no])");
            sc.nextLine();
            letsGo = sc.next().equals("yes");
        }
    }
}
