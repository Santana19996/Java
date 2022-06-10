package methodsAndChallenges;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class GreetingOfTheDay {
    static void greetingOfTheDay (){
        DateFormat dateFormat = new SimpleDateFormat("h.mm aa");
        String dateString = dateFormat.format(new Date()).toString();
        System.out.println("Current time is "+dateString);
    }

    public static void main(String[] args) {
        greetingOfTheDay();
    }

}
