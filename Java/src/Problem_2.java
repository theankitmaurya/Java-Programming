
import java.util.Random;
import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        // Write a JAVA Program to create rock, paper and scissors game

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Enter your choice:\n1 - Rock\n2 - Paper\n3 - Scissors");
        System.out.print("Your choice: ");

        int userChoice = sc.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid Choice! Please enter 1, 2, or 3.");
        } else {
            String[] choices = { "Rock", "Paper", "Scissors" };
            String personChoice = choices[userChoice - 1];

            int pcChoice = rand.nextInt(3); // 0 to 2
            String computerChoice = choices[pcChoice];

            System.out.println("You chose: " + personChoice);
            System.out.println("Computer chose: " + computerChoice);

            if (personChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((personChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                    (personChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                    (personChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        sc.close();
    }
}
