package methods;

public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }


    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingMinutes = seconds % 60;
        return getDurationString(minutes, remainingMinutes);
    }


    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(2400));
    }


}
//1 minute= 60 seconds and 1 hour = 60 mimutes or 3600 seconds.
