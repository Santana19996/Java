package methodsAndChallenges;

import java.util.Scanner;

public class DealerShip {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Welcome to the Java DealerShip!");

        System.out.println(" * Select option 'a' to buy a car");
        System.out.println(" * Select option 'b' to buy a car");
        String option = readInput.nextLine();
        switch (option) {
            case "a":
                System.out.println("What is your budget");
                int budget = readInput.nextInt();
                if(budget >= 10000){
                    System.out.println("Great! A nissan altima is avaiable");
                    System.out.println("\n Do you have Insurance?");
                    readInput.nextLine();
                    String insurance = readInput.nextLine();
                    System.out.println("\n Do you have a drivers license");
                    String driversLicense = readInput.nextLine();
                    System.out.println("What is your credit score?");
                    int creditScore = readInput.nextInt();
                    if(insurance.equals("yes") && driversLicense.equals("yes") && creditScore >= 660){
                        System.out.println("Sold! Pleasure doing business with you!");break;
                    }else{
                        System.out.println("Were sorry your not eligible");break;
                    }

                }else{
                    System.out.println("We dont sell cars under $10,000 sorry");break;
                }
                case "b":
                    System.out.println("What is you car valued at?");
                    int value = readInput.nextInt();
                    System.out.println("What is your selling price?");
                    int price = readInput.nextInt();

                    if(value > price && price < 30000){
                        System.out.println("We will buy your car!");
                    }else{
                        System.out.println("Sorry we wont be buying from you.");
                    }
                    break;
            default:
                System.out.println("Invalid option");break;
        }
       readInput.close();

    }
}
