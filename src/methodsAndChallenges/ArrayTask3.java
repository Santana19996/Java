package methodsAndChallenges;

import java.util.Scanner;

public class ArrayTask3 {
    public static void main(String[] args) {
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("Welcome to Java Grocers");
        System.out.println("What can I help you find?");
        Scanner readInput = new Scanner(System.in);
        String input = readInput.nextLine();

        for (int i = 0; i < aisles.length; i++) {
            if (input.equals(aisles[i])) {
                System.out.println("We have that in aisle " + i);
            }
        }
    }
}
