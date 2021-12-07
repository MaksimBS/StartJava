public class Cycle {
    public static void main(String[] args) {
        //цикл For от 0 до 20
        for (int i = 0; i < 21 ; i++ ) {
            System.out.println(i);
        }
        //цикл while [6, -6] (шаг 2)
        int i = 6;
        while ( i > -7 ) {
            System.out.println(i);
            i = i- 2;
        }
        //цикл do
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