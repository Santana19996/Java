package methodsAndChallenges;

public class Xs_Os {

    public static boolean isIsItTheSameAmount(String letters){
        int xCount = 0;
        int oCount =0;
        for (int i =0; i< letters.length(); i++) {
            if (letters.charAt(i) == 'x') {
                xCount += 1;
            }
        }
            for (int j =0; j< letters.length(); j++) {
                if (letters.charAt(j) == 'o') {
                    oCount += 1;
                }
            }
                if(xCount == oCount){
                    return true;

        }
            return false;
    }


    public static void main(String[] args) {
        String test = "xxooxx";
        String test2= "xxoo";

        System.out.println(isIsItTheSameAmount(test));
        System.out.println(isIsItTheSameAmount(test2));
    }
}
