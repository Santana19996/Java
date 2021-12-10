package methods;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    //    Read 10 numbers from the console entered by the user and print the sum of those numbers
//    Create a scanner like we did in the previous challenge
//    Use the has NextInt method from the scanner to check if the user has entered an int value.
//    Use the nextInt method to get the number and add it to the sum.
//    Before the user enters each number ,print the message "Enter number#x:",the next
//    "Enter number #2", and so on.
//    Hint Use a while loop,Use a counter variable for counting valid numbers,
//    close the scanner after you dont need it an
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while(counter < 10){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isInt = readInput.hasNextInt();

            if(isInt){
                int number = readInput.nextInt();
                counter ++;
                sum += number;
            }else{
                System.out.println("Please enter an integer value");
            }
         readInput.nextLine();
        }
        System.out.println("The sum of the numbers is " + sum);
        readInput.close();

    }
}
