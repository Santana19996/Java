package Lectures.Inheritance;

import Lectures.Inheritance.Car;

public class Jeep extends Car {
    private String model;

    public Jeep(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size, wheels, doors, gears, isManual);
        this.model = "Grand Cherokee";
    }


}
