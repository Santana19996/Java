package Lectures.Polymorphism.Exercise;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public Car(int cylinders, String name) {

        this.cylinders = cylinders;
        this.name=name;
        this.wheels = 4;
        this.engine = true;



    }

    public String startEngine() {
       return "Engine is now on!";
    }

    public String accelerate(){
       return "Vehicle is accelerating";
    }

    public String brake(){
        return "Vehcile is braking";
    }
}
