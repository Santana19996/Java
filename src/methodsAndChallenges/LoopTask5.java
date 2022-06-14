package methodsAndChallenges;

public class LoopTask5 {

    public static void sing(int number) {
        System.out.println(number + " bottles of beer on the wall," + number + " bottles of beer!");
        System.out.println("take one down, pass it around " + (number - 1) + ", bottles of beer on the wall!");

    }

    public static void main(String[] args) {
        for (int i = 99; i >=1 ; i--) {
            sing(i);
        }


    }
}
