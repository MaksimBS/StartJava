import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNumber;
    private boolean onGame;

    public void setSecondPlayer (Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public void setFirstPlayer (Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public void startGame() {
        onGame = true;
        hiddenNumber = getRundomNumber();
        System.out.println("Компьютер загодал число от 0 до 100. Начинайте угадывать.");

        do {
            //Пробует отгазать первый игрок
            if (onGame = true) {
                playerМove(firstPlayer);
            }
            //Пробует отгадать второй игрок
            if (onGame = true) {
                playerМove(firstPlayer);
            }
        } while (onGame == true);
    }

    private int getRundomNumber () {
        int startRange = 0;
        int endRange = 100;
        return startRange + (int) (Math.random() * endRange);
    }

    private void playerМove (Player nextPlayer) {
        System.out.println("Ход: "+nextPlayer.getName());
        nextPlayer.setNumber();
        System.out.println(nextPlayer.getName()+" называет число: "+nextPlayer.getNumber());
        if (nextPlayer.getNumber() > hiddenNumber) {
            System.out.println("Введенное "+nextPlayer.getName()+" число больше того, что загадал компьютер!");
        } else if (nextPlayer.getNumber() < hiddenNumber) {
            System.out.println("Введенное "+nextPlayer.getName()+" число меньше того, что загадал компьютер!");
        } else {
            System.out.println(nextPlayer.getName()+ " Вы выиграли! ");
            onGame = false;
        }
    }
}