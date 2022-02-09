package methodsAndChallenges;

import java.util.Arrays;

public class NumberSorter {


public static int[] sort(int[] numbers) {
Arrays.sort(numbers);
return numbers;
}



    public static void main(String[] args) {
        int[] numbers = {2,5,6,1,7,4,9};

        System.out.println(Arrays.toString(sort(numbers)));
    }
}

