import java.util.Scanner;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        hiddenNumber = getRundomNumber();
        System.out.println("Компьютер загодал число от 0 до 100. Начинайте угадывать.");

        do {
            //Пробует отгадать первый игрок
            if (playerМove(firstPlayer)) {
                break;
            }
            //Пробует отгадать второй игрок
            if (playerМove(secondPlayer)) {
                break;
            }
        } while (true);
    }

    private int getRundomNumber () {
        int startRange = 0;
        int endRange = 100;
        return startRange + (int) (Math.random() * endRange);
    }

    private boolean playerМove (Player nextPlayer) {
        System.out.println("Ход: " + nextPlayer.getName());
        System.out.print(nextPlayer.getName() + " называет число: ");
        nextPlayer.setNumber(sc.nextInt());
        if (nextPlayer.getNumber() > hiddenNumber) {
            System.out.println("Введенное " + nextPlayer.getName() + " число больше того, что загадал компьютер!");
        } else if (nextPlayer.getNumber() < hiddenNumber) {
            System.out.println("Введенное " + nextPlayer.getName() + " число меньше того, что загадал компьютер!");
        } else {
            System.out.println(nextPlayer.getName() + " Вы выиграли! ");
            return true;
        }
        return false;
    }
}