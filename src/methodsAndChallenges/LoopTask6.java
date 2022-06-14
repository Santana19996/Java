package methodsAndChallenges;

import java.util.Scanner;

public class LoopTask6 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.println("I hear you like to count by threes");
        System.out.println("  ");
        System.out.println("Jimmy: It depends." + "\n" + "oh, ok...");

        System.out.print("1.Pick a number to count by: ");
        int countBy = readInput.nextInt();
        System.out.print("2.Pick a number to start counting from: ");
        int countFrom = readInput.nextInt();
        System.out.print("3.Pick a number to count to: ");
        int countGoal = readInput.nextInt();

        for (int i = countFrom; i <=countGoal ; i+=countBy) {
            System.out.print((i) +" ");
        }

    }

}
