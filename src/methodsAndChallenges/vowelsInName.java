package methodsAndChallenges;

import java.util.Scanner;

public class vowelsInName {

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner readInput = new Scanner(System.in);
        String name = readInput.nextLine();
        System.out.print("Your name has " + countVowels(name) + " vowels");
    }
}
