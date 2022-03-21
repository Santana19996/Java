package methodsAndChallenges;

import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter two integers on same line");
        int num1 = readInput.nextInt();
        int num2 = readInput.nextInt();
        System.out.println("Enter two big  integers on same line");
        long bigNum = readInput.nextLong();
        long bigNum2 = readInput.nextLong();
        System.out.println("Enter two decimal  integers on same line");
        double decimalNum = readInput.nextFloat();
        double decimalNum2 = readInput.nextFloat();
        System.out.println("Enter two text values on same line");
        String string1 = readInput.next();
        String string2 = readInput.next();
        readInput.close();

        System.out.println("\tIntegers: " + num1 +" " + num2);
        System.out.println("\tBig Integers: " + bigNum +" " + bigNum2);
        System.out.println("\tDecimal Numbers: " + decimalNum +" " + decimalNum2);
        System.out.println("\tStrings: " + string1 +" " + string2);

    }
}
