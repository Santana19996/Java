package Lectures;

public class IntroToWhileLoops {
    public static void main(String[] args) {
        int count =6;
        while(count !=6){
            System.out.println("Count value is " + count);
            count++;
        }
        for(int i=6; i!=6;i++){
            System.out.println("Count value is " + count);
        }
        count =1;
        do {
            System.out.println("Count value was " + count);
            count++;
        }while (count !=6);
    }
}
