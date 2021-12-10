package Lectures;

public class IntroToWhileLoops {

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int count = 6;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        for (int i = 6; i != 6; i++) {
            System.out.println("Count value is " + count);
        }
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);
        int number = 4;
        int finishNumber = 20;
        int amountOfEvenNumbers = 0;
        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            amountOfEvenNumbers++;
            if (amountOfEvenNumbers >=5){
                break;
            }

        }
        System.out.println("Total Even numbers found = " + amountOfEvenNumbers);
    }
}
