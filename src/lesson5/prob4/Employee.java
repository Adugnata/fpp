package lesson5.prob4;

abstract class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;
    abstract double getPayment();

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
