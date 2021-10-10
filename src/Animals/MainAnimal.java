package Animals;

import Animals.Animal;
import Animals.Dog;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animals.Animal", 1,1,5,4);

        Dog dog = new Dog(3,4,"yORKIE",5,6,6,6,"bLACK");

        dog.eat();
       // dog.walk();
        dog.run();
    }
}
