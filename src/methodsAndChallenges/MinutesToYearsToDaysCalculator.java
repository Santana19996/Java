package methodsAndChallenges;

public class MinutesToYearsToDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long days= (minutes % 525600) /1440 ;
            long years = minutes / 525600;
            System.out.println( minutes + " min = " + years + " y" + " and " + days + " d");
        }
    }


    public static void main(String[] args) {
printYearsAndDays(525600);
printYearsAndDays(1051200);
printYearsAndDays(561600);
    }
}
//1 hour = 60 minutes
//1 day = 24 hours
//1 year = 365 days
