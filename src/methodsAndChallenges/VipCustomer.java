package methodsAndChallenges;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", "100", "gmail.com");
    }

    public VipCustomer(String name, String creditLimit) {
        this(name, creditLimit, "gmail.com");

    }

    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {

        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());

        VipCustomer customer2 = new VipCustomer("Bob", "1000");
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmailAddress());


        VipCustomer customer3 = new VipCustomer("Tim", "100", "yahoo");
        System.out.println(customer3.getName());
    }
}

//Create a new class VipCustomer
//it should have 3 fields name, credit limit, and email address.
//create 3 constructors
//1st constructor empty should call the constructor with 3 parameters with default values
//2nd constructor should pass on the 2 values it recieves and add a default value for the 3
//3rd constructor should save all fields
//create getters only for this using code generation of intellij as setters wont be needed
//test and confirm it works
