package methodsAndChallenges;

import java.util.Scanner;

public class Survey {

    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = readInput.nextLine();
        System.out.println("Hi " + name + "!");

    }
}
