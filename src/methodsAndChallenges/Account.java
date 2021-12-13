package methodsAndChallenges;

public class Account {
    private int number;
    private double balance;
    String customerName;
    String email;
    String phoneNumber;

    public Account(int number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount <0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        }else{
            balance -=withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance =" + balance);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Account oscarsAccount = new Account(123,0.00,"Oscar Santana","oscar@gmail.com","9166961196");
       oscarsAccount.deposit(2000);
     oscarsAccount.withdrawal(1000);

    }
}
