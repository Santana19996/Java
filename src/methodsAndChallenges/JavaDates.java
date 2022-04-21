package methodsAndChallenges;

import java.time.LocalDate;
import java.time.LocalTime;

public class JavaDates {


    public static String greetingOfTheDay(LocalTime time){
        if (time.isBefore(LocalTime.of(12, 0))){
            return "Good morning";

        }
        else if (time.isBefore(LocalTime.of(17, 0))){
            return "Good afternoon";
        }
        else if (time.isBefore(LocalTime.of(20, 0))){
            return "Good evening";
        }
        else {
            return "Good night";
        }


    }

    public static void main(String[] args) {
        // Create a Date object that represents the current date and time
        System.out.println(greetingOfTheDay(LocalTime.now()));


    }
}
