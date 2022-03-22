package lesson5.prob4;

public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "grossSale: " + grossSale + '\n' +
                "commissionRate: " + commissionRate + '\n' +
                "firstName: " + firstName  + '\n' +
                "lastName: " + lastName  + '\n' +
                "socialSecurityNumber: " + socialSecurityNumber;
    }

    @Override
    double getPayment() {
        return grossSale * commissionRate;
    }
}
