package methodsAndChallenges;

import java.util.Scanner;

public class loopsTask3 {
    public static void main(String[] args) {
        System.out.println("Hi Bart. I can write lines for you. What do you want me to write?");

        Scanner readInput = new Scanner(System.in);

        String bartsAnswer = readInput.nextLine();


        for (int i = 1; i <=99 ; i++) {
        System.out.println(i + "." + bartsAnswer);

        }
    }
}
