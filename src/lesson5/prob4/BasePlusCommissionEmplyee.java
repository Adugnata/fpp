package lesson5.prob4;

public class BasePlusCommissionEmplyee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmplyee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return baseSalary + super.getPayment();
    }

    @Override
    public String toString() {
        return  "baseSalary: " + baseSalary + '\n' +
                "firstName: " + firstName + '\n' +
                "lastName: " + lastName + '\n' +
                "socialSecurityNumber: " + socialSecurityNumber;
    }
}
