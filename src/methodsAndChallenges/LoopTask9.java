package methodsAndChallenges;

import java.util.Scanner;

public class LoopTask9 {

    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 5 + 1);


        System.out.print("I chose a number between 1 and 5. Try to guess it : ");
        Scanner readInput = new Scanner(System.in);
        int userGuess = readInput.nextInt();

        while (userGuess != secretNumber) {
            System.out.print("Guess again: ");
            userGuess = readInput.nextInt();
        }
        System.out.println("You got it!");
    }
}
