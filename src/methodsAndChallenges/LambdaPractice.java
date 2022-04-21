package methodsAndChallenges;

public class LambdaPractice {

    interface add {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        // Lambda practice
        add adder = (a, b) -> a + b;
        System.out.println(adder.operation(2, 3));
    }


}
