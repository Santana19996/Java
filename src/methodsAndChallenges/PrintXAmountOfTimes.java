package methodsAndChallenges;

public class PrintXAmountOfTimes {

    public static String printStringXAmountOfTimes(String string, int numberOfTimes) {
       String result = "";
       for (int i = 0; i < numberOfTimes; i++) {
           result += string;

       }
       return result;
    }

    public static void main(String[] args) {
        System.out.println( printStringXAmountOfTimes("oscar ",5));
    }
}
