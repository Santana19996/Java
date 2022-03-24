package methodsAndChallenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGameV1 {


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Welcome to Oscar's Hangman Game");



        File dictionary = new File("data/engmix.txt");
        Scanner textScanner = new Scanner(dictionary);
        Scanner readInput = new Scanner(System.in);


        ArrayList<String> words = new ArrayList<String>();
        while (textScanner.hasNextLine()) {
            words.add(textScanner.nextLine());
        }
        String hiddenText = words.get((int) (Math.random() * words.size()));

        char[] textArray = hiddenText.toCharArray();

        char[] userAnswers = new char[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            userAnswers[i] = '?';
        }

        boolean finished = false;
        int lives = 6;

        while (!finished) {
            System.out.println("********************************");
        System.out.print("Enter a letter: ");

            String letter = readInput.next();
//            check for valid input
            while (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
                System.out.println("Not a valid Input - Try Again");
                letter = readInput.next();
            }
//            check if letter is in the word
            boolean found = false;
            for (int i = 0; i < textArray.length; i++) {
                if (letter.charAt(0) == textArray[i]) {
                    userAnswers[i] = textArray[i];
                    found = true;
                }
            }
            if (!found) {
                lives--;

                System.out.println("Wrong Letter Try Again!");
            }
            boolean done = true;
            for (int i = 0; i < userAnswers.length; i++) {
                if (userAnswers[i] == '?') {
                    System.out.print("_");
                    done = false;
                } else {
                    System.out.print(" " + userAnswers[i]);
                }
            }
            System.out.println("\n" + "Lives Left" + lives);
            drawHangman(lives);


            if (done) {
                System.out.println("Congrats you Found the Word");
                finished = true;
            }
            if (lives <= 0) {
                System.out.println("You Lost!!");
                finished = true;
            }
        }
        System.out.println("The word was " + hiddenText);
    }

    public static void drawHangman(int l) {
        if (l == 6) {
            System.out.println("|----------");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 5) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 4) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 3) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 2) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (l == 1) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
    }
}
