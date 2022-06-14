package methodsAndChallenges;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalulatorv2 {

    public static int ageDiffer(int num1){


        int year = Calendar.getInstance().get(Calendar.YEAR);

        return year - num1;
    }


    public static void main(String[] args) {
        System.out.print("Hi , when were you born?");
        Scanner readInput = null;
        try {
            readInput = new Scanner(System.in);
        int useryear = readInput.nextInt();
        System.out.println("You are " +  ageDiffer(useryear) + " years old.");
        } catch (Exception e) {
            System.out.println("Not a valid number");

        }
    }
}
