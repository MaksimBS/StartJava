public class Cycle {

    public static void main(String[] args) {

        //Выведите на консоль с помощью цикла for все числа от [0, 20]
        for (int i = 0; i < 21 ; i++ ) {
            System.out.println(i);
        }

        //Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        int i = 6;
        while ( i > -7 ) {
            System.out.println(i);
            i = i- 2;
        }

        //Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
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