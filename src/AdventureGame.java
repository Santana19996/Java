import java.util.Random;
import java.util.Scanner;
public class AdventureGame {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        Random rand = new Random();

        //Game Variables
        String[] enemies = {"Mutants","Spiders","Witches"," My Bills"};
        int maxEnemyHealh = 100;
        int enemyAttackDamage =20;

        //Player Variables
        int health = 100;
        int attackDamage = 50;
        int numElixirOfHealth = 3;
        int ElixirHealAmount = 30;
        int healthElixirDropRate = 40;

        boolean running = true;
        System.out.println("Welcome to the DarkWorld");

        Game:
        while (running){
            System.out.println("-----------------");
            int enemyHealth = rand.nextInt(maxEnemyHealh);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t#" +enemy + " has appeared! #\n");

            while (enemyHealth > 0){
                System.out.println("\tYour HP:" + health);
                System.out.println("\t" + enemy + "'s HP:" + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health Elixir");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if (input.equals("1")){
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -=damageDealt;
                    health-=damageTaken;

                    System.out.println("\t> You Hit the  " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You received " + damageTaken + " damage in retaliation!");

                    if(health<1){
                        System.out.println("\t> You have taken to much damage, your close to Dying!" );
                        break;
                    }
                }
                else if (input.equals("2")){
                    if (numElixirOfHealth > 0) {
                        health += ElixirHealAmount;
                       numElixirOfHealth--;
                        System.out.println("\t> You drank a Elixir of Life,healing yourself for" + ElixirHealAmount
                                + "." + "\n\t> You now have " + health + "HP"
                                + "\n\t> You have" + numElixirOfHealth + "health potions left.\n");
                    }else{
                        System.out.println("\t> You have no Elixirs left! Defeat enemies for a chance to gain Elixir!");
                    }
                }
                else if (input.equals("3")){
                    System.out.println("\tYou have ran away from the" + enemy +"!");
                    continue Game;
                }
                else {
                    System.out.println("\tInvalid Command!");
                }
            }
if (health<1){
    System.out.println("You are about to die!!! RUNNNNNN!!!!!!");
    break ;
}
            System.out.println("-------------------------------------");
            System.out.println(" # " + enemy + "was defeated!  #" );
            System.out.println("# You have" + health+ "  HP Left!");
            if (rand.nextInt(100) > healthElixirDropRate){
                numElixirOfHealth++;
                System.out.println(" # The " +enemy+ "dropped a health potion! # ");
                System.out.println(" # You now have " + numElixirOfHealth + "  Elixirs of Life(s). #");
            }
            System.out.println("------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue in the Darkworld");
            System.out.println("2.Exit Darkworld");

            String input = in.nextLine();
            while (!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid Command!");
                input= in.nextLine();
            }
            if (input.equals("1")){
                System.out.println("You continue on your Brave Quest ");
            }
            else if (input.equals("2")){
                System.out.println("You exit the DarkWorld, congratulations on completing your adventure!");
                break ;
            }
        }
        System.out.println("#######################");
        System.out.println("# Thanks for Playing!");
        System.out.println("#########################");
    }
}
