public class Hello {
    public static void main (String[]args){
        System.out.println("Hello Oscar!");

        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber +  myThirdNumber * -100;
        System.out.println(myTotal);



//        Switch Case Practice

        char charValue = 'b';

        switch (charValue){
           case 'a':
               System.out.println("a was found");
               break;
               case 'b':
                   System.out.println("b was found");
            case 'c':case 'd':case 'e':
                System.out.println("could not fund a,b,c,d,e");
        }

    }
}
