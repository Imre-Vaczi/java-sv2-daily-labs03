package day03;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    Scanner scanner = new Scanner(System.in);
    Random objectGenerator = new Random();
    int number = objectGenerator.nextInt(100);

    public String getTheNumber() {

        System.out.println("Try to guess a number between 1 and 100, you have 6 chances!");
        boolean flagOfWinning = false;
        String message = "Better luck next time, the number was " +number;
        for (int i = 0; i < 6; i++) {
            System.out.println("Guess now! Chances left: " + (6 - i));
            int guess = scanner.nextInt();

            if (guess == number) {
                message = "You are the winner, the number is " + number;
                System.out.println(message);
                break;
            }
            if ((guess != number) & (i == 5)) {
                System.out.println(message);
                break;
            }
            if (guess > number) {
                System.out.println(guess + " is too high.");
            } else {
                System.out.println(guess + " is too low.");
            }
        }return message;
    }
}
