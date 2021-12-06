package methods;

public class LargestPrime {
    public static int getLargest(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }


    public static void main(String[] args) {
        System.out.println(getLargest(21));
        System.out.println(getLargest(217));
        System.out.println(getLargest(0));
        System.out.println(getLargest(45));
        System.out.println(getLargest(-1));

    }
}
