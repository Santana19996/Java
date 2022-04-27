package methodsAndChallenges;

import java.util.Arrays;
import java.util.Scanner;


public class ReadIntegersArrayChallenge {

    public static int[] readIntegers(int count) {
        Scanner readInput = new Scanner(System.in);

        System.out.println("Enter " + count + " numbers: ");
        int[] num = new int[count];
        for (int i = 0; i < count; i++) {
            num[i] = readInput.nextInt();
        }
        System.out.println(Arrays.toString(num));
        return num;
    }

    public static int findMinimalIntegers(int[] array) {
        int minValue = array[0];
        for (int j : array) {
            if (j < minValue) {
                minValue = j;
            }
        }
        return minValue;
    }


    public static void main(String[] args) {

    }
}
