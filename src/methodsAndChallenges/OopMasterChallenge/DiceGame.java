package methodsAndChallenges.OopMasterChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class DiceGame {

    public static int[] threeGeneratedNumbers() {
        int[] generatedNumbers = new int[3];
        generatedNumbers[0] = (int) (Math.random() * 6 + 1);
        generatedNumbers[1] = (int) (Math.random() * 6 + 1);
        generatedNumbers[2] = (int) (Math.random() * 6 + 1);
        return generatedNumbers;
    }

    public static int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean gameover = false;

        while (!gameover) {
            Scanner readInput = new Scanner(System.in);
            System.out.print("Choose 3 numbers 1-6: ");

            int number1 = readInput.nextInt();
            int number2 = readInput.nextInt();
            int number3 = readInput.nextInt();
            int playersSum = number1 + number2 + number3;


            int[] generatedNumbers = threeGeneratedNumbers();
            int sumOfGeneratedNumbers = sumOfNumbers(generatedNumbers);

            System.out.println("Generated numbers:  " + Arrays.toString(generatedNumbers));
            System.out.println(" Players Sum: " + playersSum);
            System.out.println("Computers Sum:" + sumOfGeneratedNumbers);

            if (playersSum < sumOfGeneratedNumbers && playersSum - sumOfGeneratedNumbers < 3) {
                System.out.println("Player Wins!");
                gameover = true;
            } else {
                System.out.println("Computer Wins!");
                gameover = true;
            }

        }


    }
}
