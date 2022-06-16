package methodsAndChallenges;

import java.util.Arrays;

public class ArrayTask8 {
    public static void main(String[] args) {
        double[] prices= {1.99,2.99,3.99,4.99};
        double[]newPrices= new double[prices.length];


        for (int i = 0; i <prices.length ; i++) {
        newPrices[i]= prices[i] * 1.13;
        }

        System.out.println("The original prices are: " + Arrays.toString(prices));
        System.out.println("The after tax prices are: " + Arrays.toString(newPrices));
    }
}
