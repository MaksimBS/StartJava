public class Cycle {

    public static void main(String[] args) {

        //�������� �� ������� � ������� ����� for ��� ����� �� [0, 20]
        for (int i = 0; i < 21 ; i++ ) {
            System.out.println(i);
        }

        //�������� �� ������� � ������� ����� while ��� ����� �� [6, -6] (� ����� �������� 2)
        int i = 6;
        while ( i > -7 ) {
            System.out.println(i);
            i = i- 2;
        }

        //����������� � ������� ����� do-while ����� �������� ����� �� [10, 20]. �������� �� �� �������
        i = 10;
        int symm = 0;
        do {
            if (i%2==1) {
                symm = symm + i;
            }
            i++;
        } while (i < 21);

        System.out.println(symm);
    }
}