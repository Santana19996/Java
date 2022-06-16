package methodsAndChallenges;

public class ArrayTask2 {
    public static void main(String[] args) {
        String[] aisles = {"apples","bananas","candy","chocolate","coffee","tea"};

        for (int i = 0; i <aisles.length ; i++) {
           if (aisles[i].equals("coffee")){
               System.out.println("We have that on isle " + i);
           }
        }
    }
}
