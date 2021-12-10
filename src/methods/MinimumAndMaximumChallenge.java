package methods;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int min =0;
        int max = 0;
        boolean isFirst = true;

        while (true) {
            System.out.println("Enter a number: ");
            boolean isAnInt = readInput.hasNextInt();
            if (isAnInt) {
                int number = readInput.nextInt();
                if (isFirst) {
                    isFirst=false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }else {
                break;
            }
            readInput.nextLine();
        }
        System.out.println("min: " + min + " max: " + max);
        readInput.close();
    }

}
