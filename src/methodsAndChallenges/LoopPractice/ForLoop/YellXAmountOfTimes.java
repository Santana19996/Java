package methodsAndChallenges.LoopPractice.ForLoop;

public class YellXAmountOfTimes {
    public static String shout(String wordsToSay, int numberOfTimes) {
        String result = wordsToSay;
        for (int i = 0; i <= numberOfTimes; i++) {
            result += wordsToSay;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(shout("Leeroy Jenkins", 10));
    }
}
