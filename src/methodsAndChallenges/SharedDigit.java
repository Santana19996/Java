package methodsAndChallenges;
//Factored Clean Method
public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 > 99) || (num1 < 10) || (num2 > 99) || (num2 < 10)) {
            return false;
        } else {
            return ((num1 / 10 == num2 / 10) || (num1 / 10 == num2 % 10) || (num2 / 10 == num1 % 10) || (num1 % 10 == num2 % 10));
        }
    }

//Longer but descriptive method
//public static boolean hasSharedDigit( int x, int y) {
//    if((x < 10) || (x >99) || (y < 10) || (y >99)) {
//        return false;
//    } else {
//        int lastDigitOfX = x % 10;
//        int firstDigitOfX = x / 10;
//        int lastDigitOfY = y % 10;
//        int firstDigitOfY = y / 10;
//        if((lastDigitOfX == lastDigitOfY) || (firstDigitOfX == firstDigitOfY)) {
//            return true;
//        } else if ((lastDigitOfX == firstDigitOfY) || (firstDigitOfX == lastDigitOfY)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}


    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
