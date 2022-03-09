package methodsAndChallenges;

public class Apple {

    private String color;
    private int amount;

    public Apple(String color, int amount) {
        this.color = color;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return
                 color +
                 amount
               ;
    }

    public static void main(String[] args) {

        Apple grannySmith = new Apple("Granny Smith",1);


        System.out.println(grannySmith.toString());
    }
}
