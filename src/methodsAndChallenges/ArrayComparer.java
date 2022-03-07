package methodsAndChallenges;

import java.util.stream.IntStream;

public class ArrayComparer {

    public static String whichArrayIsHigher(int[] array,int[] array2) {
        int sum1= IntStream.of(array).sum();
        int sum2= IntStream.of(array2).sum();
        if(sum1>sum2) {
            return "1st Array has Higher sum";


        }else{
            return "2nd Array has a higher sum";
        }

    }

    public static void main(String[] args) {
int[] array1 = {1,2,3,4,5,6};
int[] array2 = {1,2,3,4,5,6,7};

        System.out.println(whichArrayIsHigher(array1,array2));

    }
}
