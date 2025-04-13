import java.util.Random;
import java.util.Scanner;

class Game {

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    private int number;
    private int noOfGuesses;
    private int userInput;

    public Game() {
        number = rand.nextInt(100) + 1;
        noOfGuesses = 0;
    }

    public void takeUserInput() {
        System.out.println("Guess the number (1-100): ");
        userInput = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        noOfGuesses++;

        if (userInput == number) {
            System.out.println("Correct! You guessed it in " + noOfGuesses + " attempts.");
            return true;
        } else if (userInput < number) {
            System.out.println("Too low...");
        } else {
            System.out.println("Too high...");
        }
        return false;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int guesses) {
        this.noOfGuesses = guesses;
    }
}

public class Problem_3 {
    public static void main(String[] args) {
        /*
         * Create a class Game, which allows user to play "Guess the number" game once.
         * Game should have the following methods:
         * 1. Constructor to generate the random number.
         * 2. takeUserInput() to take a user input of number
         * 3. isCorrectNumber() to detect whether the number entered by the user is true
         * 4. getter and setter for noOfGuesses
         * Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean win = false;

        while (!win) {
            g.takeUserInput();
            win = g.isCorrectNumber();
        }
    }
}
