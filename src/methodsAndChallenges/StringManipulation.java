package methodsAndChallenges;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringManipulation {


    public static String reverseString(String str){
           StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String name = "Oscar Santana";

        System.out.println(Arrays.toString(name.getBytes(StandardCharsets.UTF_8)));;
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.charAt(1));
        System.out.println(name.contains("z"));
        System.out.println(name.length());
        System.out.println(Arrays.toString(name.split("a",2)));
        System.out.println(name.indexOf("t"));
        System.out.println(name.replaceAll("a","b"));
        System.out.println(name.matches("rovker"));


        StringBuilder test = new StringBuilder("Oscar");
        test.reverse();
        System.out.println(test);
    StringBuffer test2 = new StringBuffer("Angel");

        System.out.println(reverseString("flock"));


    }
}
