
public class MyFirstGames {

    public static void main(String[] args) {

        System.out.println("Угоднай число");
        System.out.println("Компьютер загадывает");
        System.out.println("Компьютер отгадывает");
        System.out.println("");

        // a - минимум; b - максимум
        int a = 0; 
        int b = 100; 

        // генерация случайного числа  
        int random_number = a + (int) (Math.random() * b); 

        //с воображение пока плохо, поэтому перебираем все возможные числа
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
