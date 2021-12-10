package methodsAndChallenges;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
//if (barking && hourOfDay < 8 || hourOfDay > 22){
//    return true;
//}else if (hourOfDay > 0 || hourOfDay < 23){
//    return false;
//}else{
//    return false;
//}

if(hourOfDay < 0 || hourOfDay > 23){
    return false;
}else return barking && hourOfDay < 8 || hourOfDay > 22;





    }

    public static void main(String[] args) {
        System.out.println( shouldWakeUp(true,1));
        System.out.println( shouldWakeUp(false,2));
        System.out.println( shouldWakeUp(true,8));
        System.out.println( shouldWakeUp(true,-1));

    }

}
//hourOfDay has a valid range of 0-23
//If dog barks before 8 or after 22 return true;
//else false
//if hourOfDay is less than 0 or greater than 23 return false
