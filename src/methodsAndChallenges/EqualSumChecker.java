package methodsAndChallenges;

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1,int num2,int sum){
        return num1 + num2 == sum;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }
}
