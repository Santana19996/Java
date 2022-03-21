package methodsAndChallenges;

import java.util.Scanner;

public class TriviaQuiz {
    public static void main(String[] args) {
        int score = 0;
        Scanner readInput = new Scanner(System.in);
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("a) China");
        System.out.println("b) Ireland");
        System.out.println("c) Brazil");
        System.out.println("d) Italy");

        char answer1 = readInput.next().charAt(0);
        if (answer1 == 'c') {
            score += 5;
        }
            System.out.println("2. Which planet is the hottest?");
            System.out.println("a) Venus");
            System.out.println("b) Saturn");
            System.out.println("c) Mercury");
            System.out.println("d) Mars");

            char answer2 = readInput.next().charAt(0);
            if (answer2 == 'a') {
                score += 5;
                System.out.println(score);
            }

            System.out.println("3. What is the rarest blood type?");
            System.out.println("a) Venus");
            System.out.println("b) Saturn");
            System.out.println("c) Mercury");
            System.out.println("d) AB-Negative");

            char answer3 = readInput.next().charAt(0);
            if(answer3=='d'){
                score += 5;
            }



            System.out.println("Which one of these characters is friends with Harry Potter?");
            System.out.println("a) Ron Weasley");
            System.out.println("b) Hermione Granger");
            System.out.println("c) Draco Malfoy");
            char answer4 = readInput.next().charAt(0);


            if(answer4 == 'a' || answer4 == 'b'){
                score += 5;
            }
        System.out.println( " Your final score is:" + score + "/20");

            if(score >=15){
                System.out.println("Wow, you know your stuff!");
            }

            if(score < 15  && score >=5){
                System.out.println("Not bad!");
            }else{
                System.out.println("Better luck next time Dummy!");
            }



    }
}
