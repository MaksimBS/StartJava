import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {

        System.out.println("��������� �����������");
        System.out.println("������ ����� �����1, ���� (+, -, *, /, ^, %), ����� �����2  ");
        System.out.println("�������� ���������");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.print("������� �����1: ");
        int num1 = sc.nextInt();
        // This line you have to add (It consumes the \n character)
        sc.nextLine();

        System.out.print("������� ����: ");
        String symbol = sc.nextLine();

        System.out.print("������� �����2: ");
        int num2 = sc.nextInt();

        //��������
        if (symbol.equals("+")) {
            System.out.println(num1+symbol+num2+"="+(num1+num2));
        // ���������
        } else if (symbol.equals("-")) {
            System.out.println(num1+symbol+num2+"="+(num1-num2));
        // ���������
        } else if (symbol.equals("*")) {
            System.out.println(num1+symbol+num2+"="+(num1*num2));
        // �������
        } else if (symbol.equals("/")) {
            System.out.println(num1+symbol+num2+"="+(num1/num2));
        // ���������� � �������
        } if (symbol.equals("^")) {
            int result = 1;
            for (int i = 1; i < num2+1; i++) {
                result = result * num1;
            }
            System.out.println(num1+symbol+num2+"="+result);
        // �������
        } if (symbol.equals("%")) {
            double x;
            x = (double)num1 / (double)num2; 
            System.out.println(num1+symbol+num2+"="+ (x % 1));
        // �� ������ ��������
        } else {
            System.out.println("������� �������� ����������, ���������� �����");
        }
    }
}

