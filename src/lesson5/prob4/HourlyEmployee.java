package lesson5.prob4;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + '\n' +
                "lastName: " + lastName + '\n' +
                "socialSecurityNumber: " + socialSecurityNumber + '\n' +
                "wage: " + wage + '\n' +
                "hours: " + hours;
    }
}
