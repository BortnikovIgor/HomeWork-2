import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(11); // случайное число от 0 до 10
            System.out.println("Угадайте число от 0 до 10. У вас 3 попытки.");

            boolean win = false;
            for (int attempt = 1; attempt <= 3; attempt++) {
                System.out.print("Попытка " + attempt + ": ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Поздравляем! Вы угадали число!");
                    win = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Загаданное число больше.");
                } else {
                    System.out.println("Загаданное число меньше.");
                }
            }

            if (!win) {
                System.out.println("Вы проиграли. Загаданное число было: " + numberToGuess);
            }

            System.out.print("Повторить игру еще раз? 1 - да/0 - нет: ");
            int choice = scanner.nextInt();
            playAgain = (choice == 1);
        }

        System.out.println("Игра завершена. Спасибо за игру!");
        scanner.close();
    }
}

