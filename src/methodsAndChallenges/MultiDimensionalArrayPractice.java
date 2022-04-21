package methodsAndChallenges;

public class MultiDimensionalArrayPractice {


    public static void printFirstRow(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[0][i] + " ");
        }
    }

    public static void printFirstColumn(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0] + " ");
        }
    }


    public static void main(String[] args) {

        String[][] names = {{"John", "Jane", "Joe"},
                {"Smith", "Jones", "Taylor"},
                {"Brown", "Smith", "Johnson"}};

        System.out.println(names[0][0]);
        System.out.println("----------------");
        System.out.println(names[2][1]);
        System.out.println("----------------");


        printFirstRow(names);


        System.out.println("----------------");

        printFirstColumn(names);


    }
}
