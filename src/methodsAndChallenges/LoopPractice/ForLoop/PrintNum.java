package methodsAndChallenges.LoopPractice.ForLoop;

public class PrintNum {
    public static int printNumber(){
        int numbers = 0;
        for (int i = 0; i<=10;i++){
            numbers+=i;
            System.out.println("Number: " + i);
        }
        return numbers;
    }


    public static void main(String[] args) {
       printNumber();
    }
}
