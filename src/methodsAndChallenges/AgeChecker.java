package methodsAndChallenges;

import java.util.Scanner;

public class AgeChecker {


    public static int getNumberInput() {
        Scanner readInput = new Scanner(System.in);
        int number = 0;
        try {
            number = readInput.nextInt();
            if (number >= 18) {
                System.out.println("You may Drink");
            } else {
                System.out.println("You may not drink");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
            return getNumberInput();
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println("How old are you?");
        System.out.println(getNumberInput());
    }
}
