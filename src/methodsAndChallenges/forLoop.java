package methodsAndChallenges;

public class forLoop {

    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Body of loop Running");
            System.out.println(i );
            for (int j = 0; j <=i ; j++) {
                System.out.println("---------");
            }
        }
    }
}
