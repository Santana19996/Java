package methodsAndChallenges;

public class ReplaceSinString {

    public static String replaceS (String str) {
        return str.replaceAll("(?i)s", "x");
    }

    public static void main(String[] args) {
        String test1 = "Samantha";
        String test2 = "suSan";

        System.out.println(replaceS(test1));
        System.out.println(replaceS(test2));
    }
}
