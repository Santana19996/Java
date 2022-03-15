package methodsAndChallenges;

import java.util.Arrays;

public class ReversePrintStringArray {

    public static void main(String[] args) {

        String[] stringArray = {"Apples","Bananas","Coconuts","Dragon Fruit"};

        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i] + " ");

        }

    }
}
