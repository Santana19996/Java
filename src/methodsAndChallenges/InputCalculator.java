package methodsAndChallenges;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner readInput = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (readInput.hasNextInt()) {
            sum += readInput.nextInt();
            count++;
        }
        System.out.println("Sum: " + sum + "Average: " + sum / count);
        readInput.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}

