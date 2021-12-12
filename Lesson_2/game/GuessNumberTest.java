import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player firstPlayer = new Player();
        firstPlayer.setName(sc.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player secondPlayer = new Player();
        secondPlayer.setName(sc.nextLine());

        GuessNumber game = new GuessNumber();
        game.setFirstPlayer(firstPlayer);
        game.setSecondPlayer(secondPlayer);

        String nextTurn = "yes";
        while (nextTurn.equals("yes")) {
            game.startGame();
            do {
                System.out.println("Хотите продолжить? [yes/no]: ");
                nextTurn = sc.next();
            } while (nextTurn.equals("yes") == false && nextTurn.equals("no") == false);
        }
    }
}