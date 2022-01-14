package Lectures.Arrays;

import java.util.Arrays;

public class ArrayExcercise {

    public static int [] array = {1,2,3,4,5,6,7,8,9,10};

    public static void printArray(){
        for (int j : array) {
            System.out.print(j);
        }
    }

    public static int addAllArrayValues(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }



    public static void main(String[] args) {
//        printArray();
        System.out.println(addAllArrayValues(array));
        System.out.println(Arrays.toString(array));

    }
}
