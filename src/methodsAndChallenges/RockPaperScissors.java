package methodsAndChallenges;

import java.util.Scanner;


public class RockPaperScissors {


    public static void game() throws Exception {
        Scanner scanner = new Scanner(System.in);

        String playerChoice;
        String computerChoice;
        int playerScore = 0;
        int computerScore = 0;
        int tieScore = 0;
        int round = 1;
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("Round " + round);
            System.out.print("Enter your choice: rock, paper, or scissors:");

            playerChoice = scanner.nextLine();
            computerChoice = generateRandomString();
            if (!playerChoice.equalsIgnoreCase("rock") && !playerChoice.equalsIgnoreCase("paper") && !playerChoice.equalsIgnoreCase("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }
            if (playerChoice.equals(computerChoice)) {
                System.out.println("Tie!");
                tieScore++;
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("Player wins!");
                playerScore++;
            } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("Player wins!");
                playerScore++;
            } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("Player wins!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Player: " + playerScore + " Computer: " + computerScore + " Tie: " + tieScore);
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("y")) {
                round++;
            } else {
                gameOver = true;
            }

        }


    }

    public static String generateRandomString() {
        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = (int) (Math.random() * choices.length);
        return choices[randomIndex];

    }


    public static void main(String[] args) throws Exception {

        game();
    }
}
