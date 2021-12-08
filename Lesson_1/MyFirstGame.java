public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Угодай число");
        System.out.println("Программа загадывает число");
        System.out.println("Программа угадывает число");
        System.out.println("");

        // диапазон чисел загадывания
        int startRange = 0; 
        int endRange = 100; 

        // загадываем число
        int randomNumber = startRange  + (int) (Math.random() * endRange ); 

        //пробуем угодать в цикле, программа тупенькая перебирает все в подряд.
        for (int i = 0; i < 101; i++) {
            if (i < randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");        
            } else if (i == randomNumber) {
                System.out.println("Поздравляю, число угадано!");
                break;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}