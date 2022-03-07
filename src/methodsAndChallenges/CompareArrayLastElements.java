package methodsAndChallenges;

public class CompareArrayLastElements {

    public static boolean hasSameBread(String[] a, String[] b){
        String lastA = a[a.length-1];
        String firstA = a[0];

        String lastB = b[b.length-1];
        String firstB = b[0];

        Boolean compareThem = lastA.equals(lastB) && firstA.equals(firstB);

        return compareThem;
    }

    public static void main(String[] args) {
  String[] firstArray = {"white bread", "tomato", "white bread"};
  String[] secondArray= {"white bread", "lettuce", "white bread"};


  String[] falseArray = {"brown bread", "chicken", "brown bread"};
  String[] secondFalseArray= {"white bread", "chicken", "white bread"};

        String[] falseArray2 = {"toast", "cheese", "toast"};
        String[] secondFalseArray2= {"brown bread", "cheese", "toast"};





        System.out.println(hasSameBread(firstArray, secondArray));
        System.out.println(hasSameBread(falseArray,secondFalseArray));
        System.out.println(hasSameBread(falseArray2,secondFalseArray2));

    }
}
