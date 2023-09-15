import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1, upperBound = 100, maxAttempts = 10, attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("I've picked a number between %d and %d.%n", lowerBound, upperBound);

        while (attempts < maxAttempts) {
            int mid = (lowerBound + upperBound) / 2;
            System.out.printf("Enter your guess between %d and %d: ", lowerBound, upperBound);
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == mid) {
                System.out.printf("Congratulations! You guessed the number %d in %d attempt(s).%n", mid, attempts);
                break;
            } else if (userGuess < mid) {
                System.out.println("Try a higher number.");
                lowerBound = mid + 1;
            } else {
                System.out.println("Try a lower number.");
                upperBound = mid - 1;
            }

            System.out.printf("You have %d attempts remaining.%n", maxAttempts - attempts);
        }

        if (attempts == maxAttempts) {
            System.out.printf("Sorry, you've reached the maximum number of attempts. The number was between %d and %d.%n", lowerBound, upperBound);
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
