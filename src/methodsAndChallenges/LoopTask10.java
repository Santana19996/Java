package methodsAndChallenges;

import java.util.Scanner;

public class LoopTask10 {
    public static void main(String[] args) {
        String username = "oscar";
        String password = "java";


        System.out.println("Welcome to Javagram sign in below!");
        System.out.println(" ");

        System.out.print("Username:");
        Scanner readInput = new Scanner(System.in);
        String usernameInput = readInput.nextLine();
        System.out.print("Password:");
        String userPassword = readInput.nextLine();


        while (!usernameInput.equals(username) && !userPassword.equals(password)){
            System.out.print("Incorrect Please Try again: " );
            System.out.println(" ");
            System.out.print("Username: ");
            usernameInput=readInput.nextLine();

            System.out.print("Password: ");
            userPassword=readInput.nextLine();

        }
        System.out.println("Sign in Successful Welcome!");
    }



}
