package methodsAndChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BagelGame {


    public static int randomThreeDigitNumber() {
        Random random = new Random();
        return  random.nextInt(999) + 100;
    }



    public static int captureInput() {
        System.out.println("Enter guess");
        Scanner readInput = new Scanner(System.in);
        return readInput.nextInt();
    }


//public static String checkGuess(String input){
//        int number = randomThreeDigitNumber();
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == number) {
//                return "Pico";
//            }
//        }
//}
    public static int[] convertIntToArray(int input) {
        String temp = Integer.toString(input);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        return newGuess;
    }


    public static void giveClue(int num, int secretNum) {
        int[] guessNumArray = convertIntToArray(num);
        int[] secretNumArray = convertIntToArray(secretNum);

        String response = "";

        boolean isFermium = false;

        for (int i = 0; i < 3; i++) {
            if (guessNumArray[i] == secretNumArray[i]) {
                isFermium = true;
               response += "Fermi ";

            }
        }

        if (!isFermium) {
            response += "Bagels ";
        }

        System.out.println(response);
    }

    public static void main(String[] args) {

        int secretNumber = randomThreeDigitNumber();
        System.out.println(secretNumber);
        int maxTries = 10;
        for (int numberOfTries = 0; numberOfTries <= maxTries; numberOfTries++) {
            int playerGuess = captureInput();
            if ((playerGuess != secretNumber) && (numberOfTries == maxTries - 1)) {
                System.out.println("Wrong,\n and you suck ass");
            } else if (playerGuess != secretNumber) {
                System.out.println("Wrong");
                giveClue(playerGuess, secretNumber);
            } else {
                System.out.println("Correct");
                break;
            }
        }



    }
}

//
