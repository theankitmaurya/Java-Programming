
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
//        Write a JAVA Program to create rock, paper and scissors game

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Enter your choice(1 - Rock, 2 - Paper, 3 - Scissors): ");
        System.out.println("Your choice: ");

        int userChoice = sc.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid Choice! Please enter 1, 2 or 3.");
        } else {
            String personChoice = "";
            String computerChoice = "";

            if (userChoice == 1) {
                personChoice = "Rock";
            } else if (userChoice == 2) {
                personChoice = "Paper";
            } else {
                personChoice = "Scissors";
            }

            int pcChoice = rand.nextInt(3) + 1;
            if (pcChoice == 1) {
                computerChoice = "Rock";
            } else if (pcChoice == 2) {
                computerChoice = "Paper";
            } else {
                computerChoice = "Scissors";
            }

            System.out.println("Your choice is: " + personChoice + " and computer's choice is: " + computerChoice + ".");

            if (Objects.equals(userChoice, computerChoice)) {
                System.out.println("It'//s a tie!");
            } else if ((Objects.equals(userChoice, "Rock") && computerChoice.equals("Scissors"))
                    || (Objects.equals(userChoice, "Paper") && computerChoice.equals("Rock"))
                    || (Objects.equals(userChoice, "Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
    }
}
