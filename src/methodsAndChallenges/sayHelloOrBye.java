package methodsAndChallenges;

public class sayHelloOrBye {
    public static String sayHelloBye(String name, int num) {

        String capitalName =name.substring(0, 1).toUpperCase() + name.substring(1);
        String hello = "Hello" + " " + capitalName;
        String bye = "Bye" + " " + capitalName;

        if(num == 0){
            return bye;
        }
        else if(num == 1){
            return hello;
        }
return hello;
    }

    public static void main(String[] args) {
        System.out.println(sayHelloBye("Oscar",0));
        System.out.println(sayHelloBye("Tomi",1));
        System.out.println(sayHelloBye("timmy",1));
    }

}

