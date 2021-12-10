package methodsAndChallenges;

import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int setAge(int age) {
        if ( age < 0 || age > 100){
            return this.age = 0;
        }
      return this.age;
    }

    public  boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName() {
         if(firstName.isEmpty() && lastName.isEmpty()){
             return "";
         }
         if(firstName.isEmpty()){
             return lastName;
         }
         if(lastName.isEmpty()){
             return firstName;
         }
         return firstName + " " + lastName;

    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Oscar ");
        person.setLastName("Santana");
        person.setAge(25);
        System.out.println("Full name= " + person.getFullName());
        System.out.println("Is " + person.getFullName() + " a teen? " + person.isTeen() );


    }
}
