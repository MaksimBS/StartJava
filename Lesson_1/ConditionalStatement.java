public class ConditionalStatement
{
    public static void main(String[] args) {

        //�������
        byte age = 40;
        // 1- ������� 2 - �������
        byte gender = 1;
        //���� � �.
        double height = 1.82;
        //������ ����� �����
        char firstLetterName = 'X';

        if (age > 20) {
            System.out.println("�������: " + age);
        }

        if (gender == 1) {
            System.out.println("���: �");
        } else if (gender == 2) {
            System.out.println("���: �");
        }

        if (height < 1.80) {
            System.out.println("���� ���� 1.8�.");
        } else {
            System.out.println("���� 1.8� ��� ����");
        }

        if(firstLetterName == 'M') {
            System.out.println("������ ����� ����� ���������� �� �");
        } else if(firstLetterName == 'I') {
            System.out.println("������ ����� ����� ���������� �� I");
        } else {
            System.out.println("������ ����� ����� ���������� �� "+firstLetterName);
        }
    }
}

