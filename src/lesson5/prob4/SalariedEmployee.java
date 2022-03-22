package lesson5.prob4;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + '\n' +
                "lastName: " + lastName + '\n' +
                "socialSecurityNumber: " + socialSecurityNumber + '\n' +
                "weeklySalary: " + weeklySalary;
    }
}
