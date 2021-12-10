package methodsAndChallenges;

public class DecimalOperator {
    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble){
        int myFirstCheck = (int)(myFirstDouble * 1000);
        int mySecondCheck = (int)(mySecondDouble * 1000);

        if(myFirstCheck - mySecondCheck == 0){

            return true;
        } else

            return false;

    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
    }

}
