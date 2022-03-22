package lesson5.prob4;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees = {
                new CommissionEmployee("Alberto", "Ando", "5678", 50000.00, 0.2),
                new BasePlusCommissionEmplyee("Rebecca", "Franklin", "5679", 40000.00, 0.02, 2000.00),
                new HourlyEmployee("Abebe", "Alemu", "5678", 50, 160),
                new SalariedEmployee("Lidya", "Gabriel", "5678", 8000.00)
        };
        double totalSalary = 0;
        for (Employee e : employees) {
            System.out.println(e);
            totalSalary += e.getPayment();
        }
        System.out.println("Total Salary:" + totalSalary);
    }
}
