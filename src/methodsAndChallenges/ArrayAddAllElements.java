package methodsAndChallenges;

import java.util.Arrays;

public class ArrayAddAllElements {

    public static int[] addToArray(int[] array) {
 int[] newArray = new int[array.length ];

 for (int i = 0; i < array.length; i++){
     newArray[i] = array[i] +1;
        }

return newArray;

    }

    public static void main(String[] args) {

        int[]testArray = {1,2,3,4,5};

        System.out.println(Arrays.toString(addToArray(testArray)));;
    }
}
