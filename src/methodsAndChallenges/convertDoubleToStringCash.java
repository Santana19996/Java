package methodsAndChallenges;

public class convertDoubleToStringCash {

    public static String convertDoubleToString(double number) {

String value = String.valueOf(number );

String result = "$" + value ;

return result;
    }


    public static void main(String[] args) {
        System.out.println(convertDoubleToString(5.00));
    }
}
