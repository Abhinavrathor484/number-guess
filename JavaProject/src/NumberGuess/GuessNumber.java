import java.util.Random;
import java.util.Scanner;



public class GuessNumber {
	private static final int MAX_ATTEMPTS = 5;
    private static final int MAX_ROUNDS = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int round = 1;

        System.out.println("Welcome to the Number Guessing Game!");

        while (round <= MAX_ROUNDS) {
            System.out.println("Round " + round);
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int score = MAX_ATTEMPTS;

            System.out.println("I'm thinking of a number between 1 and 100. You have " + MAX_ATTEMPTS + " attempts.");

            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    score -= attempts - 1;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            totalScore += score;
            round++;

            System.out.println("The number was: " + targetNumber);
            System.out.println("Your score for this round: " + score);
            System.out.println("---------------------------------------");
        }

        System.out.println("Game over!");
        System.out.println("Total score: " + totalScore);

        scanner.close();
    }

}
