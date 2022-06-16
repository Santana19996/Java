package methodsAndChallenges;

import java.util.Scanner;

import static methodsAndChallenges.LoopTask11.rollDice;

public class LoopTask12 {

    int roll = rollDice();

    public static void main(String[] args) {
        System.out.println("Let's play Rolling Java. Type anything to start.\n");
        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6 the game stops.");
        System.out.println("- If you roll a 4 nothing happens.");
        System.out.println("- Otherwise, you get 1 point\\n.");
        System.out.println(">You must collect at least 3 points to win. Enter anything to roll:");

        Scanner readInput = new Scanner(System.in);
        String userinput = readInput.nextLine();

        boolean gameOver = false;
        int points = 0;
        while (!gameOver) {
            int value = rollDice();
            System.out.println("You rolled a " + value);

            if (value == 6) {
                gameOver = true;
                System.out.println("End of Game");
            } else if (value == 4) {
                System.out.println("Zero points. Keep rolling.");
            } else {
                points += 1;
                System.out.println("One point Keep rolling");
            }
        }
if(points >= 3){
    System.out.println("Your score is " + points);
    System.out.println("Wow, that's lucky. You win!");
}else{
    System.out.println("Your score is " + points);
    System.out.println("Tough luck, you lose :(");
}
    }
}
