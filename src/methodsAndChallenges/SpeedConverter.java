package methodsAndChallenges;

public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
return Math.round(kilometersPerHour/1.609);
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        printConversion(1.5);
        printConversion(-5.6);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {

            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

}

//1 Mile per hour is 1.609 kilometers per hour
