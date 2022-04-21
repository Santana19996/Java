package methodsAndChallenges.OopMasterChallenge;

import java.util.ArrayList;

public class EnhancedForLoopPractice {

    public static void main(String[] args) {
        String[] names = {"John", "Paul", "George", "Ringo"};
        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Paul");
        namesList.add("George");
        namesList.add("Ringo");
        for (String name : namesList) {
            System.out.println(name);
        }
    }


    
}
