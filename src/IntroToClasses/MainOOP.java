package IntroToClasses;

public class MainOOP {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carerra");
        porsche.setWheels(4);
        System.out.println(porsche.toString() + porsche.getModel() + " With " + porsche.getWheels() +  " Wheels");



    }
}
