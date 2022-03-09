package methodsAndChallenges;

public class RemoveFirstLastChar {

    public static String removeFirstLast(String str) {

        if(str.length() < 2) {
            return str;
        }
        String newSting = str.substring(1, str.length() -1);
return newSting;

    }


    public static void main(String[] args) {
String test1 = "Oscar";
String failed= "a";

        System.out.println(removeFirstLast(test1));
        System.out.println(removeFirstLast(failed));

    }
}
