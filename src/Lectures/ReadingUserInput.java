package Lectures;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        System.out.println("Enter your Year of birth ");
        boolean hasNextInt = readInput.hasNextInt();
        if (hasNextInt) {

            int dob = readInput.nextInt();
            readInput.nextLine();

            System.out.println("Enter your name: ");
            String name = readInput.nextLine();
            int age = 2021 - dob;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and your are " + age + " years old ");
            } else {
                System.out.println("You are not born yet");
            }
        }else {
            System.out.println("You have entered a wrong input");
        }

        readInput.close();
    }

}
