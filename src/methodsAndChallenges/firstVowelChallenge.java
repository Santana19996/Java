package methodsAndChallenges;

public class firstVowelChallenge {

    public static int firstVowel(String str) {
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
                return str.indexOf(c);
            }
            else if(c == 'A' || c=='E' || c=='I' || c=='O' || c=='U'){
                return str.indexOf(c);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(firstVowel("apple"));
        System.out.println(firstVowel("hello"));
        System.out.println(firstVowel("STRAWBERRY"));
        System.out.println(firstVowel("pInEaPPLe"));
    }
}

