
public class MyFirstGames {

    public static void main(String[] args) {

        System.out.println("������� �����");
        System.out.println("��������� ����������");
        System.out.println("��������� ����������");
        System.out.println("");

        // a - �������; b - ��������
        int a = 0; 
        int b = 100; 

        // ��������� ���������� �����  
        int random_number = a + (int) (Math.random() * b); 

        //� ����������� ���� �����, ������� ���������� ��� ��������� �����
        for (int i = 0; i < 101 ; i++ ) {
            if (i < random_number) {
                System.out.println("������ ����� ������ ����, ��� ������� ���������");        
            } else if (i == random_number) {
                System.out.println("����������, ����� �������!");
                i = 101;
            } else {
                System.out.println("������ ����� ������ ����, ��� ������� ���������");
            }
        }
    }
}
