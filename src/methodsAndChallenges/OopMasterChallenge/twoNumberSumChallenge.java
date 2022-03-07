package methodsAndChallenges.OopMasterChallenge;

import java.util.Arrays;

public class twoNumberSumChallenge {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            int firstNumber = array[i];

            for (int j = i+1; j < array.length; j++) {
                int secondNumber = array[j];
                if (firstNumber + secondNumber == targetSum) {
                    return new int[]{firstNumber, secondNumber};
                }
                }
            }
                    return new int[0];
            }


    public static void main(String[] args) {

        int[] test1 = {3, 5, -4, 8, 11, 1, -1, 6};
        int []test2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int []test3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[]test4={14};

        System.out.println(Arrays.toString(twoNumberSum(test1, 10)));
        System.out.println(Arrays.toString(twoNumberSum(test2, 18)));
        System.out.println(Arrays.toString(twoNumberSum(test3, 17)));
        System.out.println(Arrays.toString(twoNumberSum(test4, 15)));
    }
}
