package methodsAndChallenges;

import java.util.Arrays;

public class NumberSorter {


    public static int findSmallestInt(int[] args) {

        Arrays.sort(args);
        return args[0];
    }



    public static void main(String[] args) {
        int[] numbers1 = {34, 15, 88, 2};
        int[] numbers2 = {34, -345, -1, 100};
        int[] numbers3 = {7, 7, 7};

        System.out.println(findSmallestInt(numbers1));
        System.out.println(findSmallestInt(numbers2));
        System.out.println(findSmallestInt(numbers3));

    }
}

