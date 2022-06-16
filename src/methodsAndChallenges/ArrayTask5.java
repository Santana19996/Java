package methodsAndChallenges;

public class ArrayTask5 {
    public static int randomNumber() {
        return (int) (Math.random() * 50000);
    }

    public static void main(String[] args) {
        int[] randomArray = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        System.out.print("Here are the scores: ");
        int highScore = 0;
        int seat = 0;
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
        for (int i = 0; i < randomArray.length; i++) {

            if (randomArray[i] > highScore) {
                highScore = randomArray[i];
                seat=i;

            }

        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");

    }

}
