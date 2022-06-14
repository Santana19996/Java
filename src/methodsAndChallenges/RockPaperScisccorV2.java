package methodsAndChallenges;

import java.util.Scanner;

public class RockPaperScisccorV2 {

    public static String generateRandomString() {
        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = (int) (Math.random() * choices.length);
        return choices[randomIndex];

    }
    public static void main(String[] args) {
            boolean gameOver = false;
        while (!gameOver) {
            String computerChoice = generateRandomString();
            System.out.println("Welcome to RPV");
            System.out.print("Please choose your hand: ");
            Scanner readInput = new Scanner(System.in);
            String userChoice = readInput.nextLine();
            System.out.println("You chose " + userChoice);
            System.out.println("The computer chose " + computerChoice);

            if (userChoice.equals(computerChoice)){
                System.out.println("Its a Tie");
                gameOver = true;
            }
            if (computerChoice.equals("rock") && userChoice.equals("paper")){
                System.out.println("You win");
                gameOver=true;
            }



        }


    }





}
