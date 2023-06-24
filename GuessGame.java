package DemoClass;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private int randomNumber;
    private int noOfGuess;

    // Constructor to generate a random number and initialize the number of guesses to 0
    public GuessGame() {
        generateRandomNumber();
        noOfGuess = 0;
    }

    // Method to generate a random number between 1 and 100
    private void generateRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
    }

    // Method to take user input and check if it is the correct number
    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int userInput = scanner.nextInt();
        noOfGuess++;

        if (isCorrectNumber(userInput)) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Wrong guess! Try again.");
        }
    }

    // Method to check if the user's guess is the correct number
    private boolean isCorrectNumber(int guess) {
        return guess == randomNumber;
    }

    // Getter method to retrieve the number of guesses made
    public int getNoOfGuess() {
        return noOfGuess;
    }

    // Setter method to update the number of guesses
    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessGame game = new GuessGame();              // Create a Game object
		game.takeUserInput();                // Allow the user to make a guess

		int numOfGuesses = game.getNoOfGuess();  // Get the number of guesses made
		System.out.println("Number of guesses: " + numOfGuesses);

	}

}

