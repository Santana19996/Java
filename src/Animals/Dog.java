package Animals;

public class Dog  extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(  int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super("Kell" , 1, size, weight, 3);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Animals.Dog.eat() called");
        chew();

    }

    private void chew(){
        System.out.println("Animals.Dog.chew() called");
    }
    public void walk(){
        System.out.println("Animals.Dog.walk() called");
        move(5);
    }
private void moveLegs(int speed){
    System.out.println("Animals.Dog.movelegs() called");
}
    @Override
    public void move(int speed) {
        System.out.println("Animals.Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    public void run(){
        System.out.println("Animals.Dog.run() called");
        move(10);
    }

}
