package methodsAndChallenges;

import java.util.Scanner;

public class LoopTask4 {
    public static void main(String[] args) {
        System.out.print("Hi Timmy! Choose a number to count to: ");

        Scanner readInput = new Scanner(System.in);
        int choice = readInput.nextInt();
            System.out.println("Great Here's how it's done");

        for (int i = 0; i <= choice; i++) {
            System.out.print(i + " ");
        }
    }
}
