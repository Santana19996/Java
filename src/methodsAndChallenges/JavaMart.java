package methodsAndChallenges;

public class JavaMart {
    public static void main(String[] args) {
    double wallet = 100;
    double toyCar= 5.99;
        System.out.println("Can I get this car?");

        if(wallet >= toyCar){
            System.out.println("Sure!");
            wallet-=toyCar;
            System.out.println("Your new total balance is " + wallet);
        }else{
            System.out.println("Sorry I only have " + wallet);
        }
    }

}
