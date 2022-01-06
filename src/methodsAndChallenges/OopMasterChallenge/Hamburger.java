package methodsAndChallenges.OopMasterChallenge;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Price = price;
        addition1Name = name;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Price = price;
        addition2Name = name;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Price = price;
        addition3Name = name;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Price = price;
        addition4Name = name;
    }

    public double itemizeHamburger() {
       double hamburgerPrice = this.price;
        System.out.println(this.name + "hamburger " + " on a " + this.breadRollType + " roll" + "price is  " + this.price);
        if (this.addition1Name !=null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name !=null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name !=null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name !=null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }


    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sasuage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        hamburger.addHamburgerAddition4("Pickles",2.00);

        System.out.println("Total Burger price is " +  hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);


        healthyBurger.addHamburgerAddition1("Egg",5.43);
        healthyBurger.itemizeHamburger();



    }

}

