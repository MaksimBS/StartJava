public class MyFirstGames {
    public static void main(String[] args) {
        System.out.println("Угодай число");
        System.out.println("Программа загадывает число");
        System.out.println("Программа угадывает число");
        System.out.println("");

        // диапазон чисел загадывания
        int a = 0; 
        int b = 100; 

        // загадываем число
        int random_number = a + (int) (Math.random() * b); 

        //пробуем угодать в цикле, программа тупенькая перебирает все в подряд.
        for (int i = 0; i < 101 ; i++ ) {
            if (i < random_number) {
                System.out.println("Данное число больше того, что загадал компьютер");        
            } else if (i == random_number) {
                System.out.println("Поздравляю, число угадано!");
                i = 101;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}
