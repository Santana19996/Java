package methods;

public class IsEvenNumber {

    public static boolean isEvenNumber(int number){
        return number % 2 ==0;
    }

    public static void main(String[] args) {
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(3));

    }
}
