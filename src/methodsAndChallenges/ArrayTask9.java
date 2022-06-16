package methodsAndChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask9 {
    public static void main(String[] args) {
        System.out.println("How many pizza toppings do you want?.");
        Scanner readInput = new Scanner(System.in);
        int userAmount = readInput.nextInt();
        String[] toppings = new String[userAmount];

        System.out.println("Great , enter each topping!");
        for (int i = 0; i <toppings.length ; i++) {
            System.out.print(i + ". ");
            toppings[i] = readInput.next();

        }
        System.out.println("Thank you Here are the toppings you Ordered!");

        for (int i = 0; i <toppings.length ; i++) {
            System.out.println( i + ". " +  toppings[i]);
        }
        System.out.println("Press anything to confirm your order.");
        readInput.next();
        System.out.println("Great, a driver is on the way!");
    }


}
