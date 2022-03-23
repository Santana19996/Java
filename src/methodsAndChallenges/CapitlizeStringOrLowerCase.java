package methodsAndChallenges;

public class CapitlizeStringOrLowerCase {

    public static String capitolOrLowerCase(String s, String option) {
       switch (option) {
           case "capitol":
               return s.toUpperCase() ;
           case "lower":
               return s.toLowerCase();
           default: return "Enter a Valid Option";
       }
    }


    public static void main(String[] args) {
        System.out.println(capitolOrLowerCase("Hello", "capitol"));
        System.out.println(capitolOrLowerCase("Hello", "lower"));
        System.out.println(capitolOrLowerCase("Hello", ""));

        double random = Math.random() * 3 +1;

        System.out.println((int)random);
    }

}
