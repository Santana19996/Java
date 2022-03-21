package methodsAndChallenges;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = readInput.nextLine();
        System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
        String location = readInput.nextLine();
        System.out.println("I hear it's beautiful in " + location + "!" + " I'm from a place called Oracle");
        System.out.println("How old are you");
        int age = readInput.nextInt();
        System.out.println("So your " + age + ", cool! I'm 400 years old!");
        int difference = 400/age;
        System.out.println("This means I am " + difference + " times older than you");
        System.out.println("Enough about me. Whats your favorite language? (Dont say Python)");
        readInput.nextLine();
        String favoriteLanguage = readInput.nextLine();
        System.out.println(favoriteLanguage + ", thats great! Nice chatting with you " + name + "I have to log off now. See ya!");
    }
}
