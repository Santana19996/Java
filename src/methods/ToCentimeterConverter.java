package methods;

public class ToCentimeterConverter {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
       double centimeters= (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5,11);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters( double inches) {
if(inches < 0){
    return -1;
}
double feet= (int) inches /12;
double reminingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to" + feet + "feet and " + reminingInches);
        return calcFeetAndInchesToCentimeters(feet,reminingInches);
    }
}
