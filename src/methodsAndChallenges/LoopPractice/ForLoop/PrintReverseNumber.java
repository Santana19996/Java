package methodsAndChallenges.LoopPractice.ForLoop;

public class PrintReverseNumber {

    public static int printReverseNumber() {
        int numbers =0;

        for (int i = 10; i>=0; i--){
           numbers =i;
            System.out.println("Number: " + numbers);
        }
        return numbers;
    }

    public static void main(String[] args) {
        printReverseNumber();
    }
}
