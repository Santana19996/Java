package methodsAndChallenges;

import java.util.Arrays;

public class SplitMethodPractice {




    public static void main(String[] args) {


        String names = "John, Paul, George, Ringo";

        String[] arrayOfNames = names.split(",",1);

        System.out.println(Arrays.toString(arrayOfNames));
        System.out.println("---------------");

        for (int i = 0;i<arrayOfNames.length;i++){
            System.out.println(arrayOfNames[i]);
        }
    }
}
