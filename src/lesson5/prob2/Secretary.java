package lesson5.prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double vertimeHours;

    public Secretary(String name, double salary, LocalDate hireFate, double vertimeHours) {
        super(name, salary, hireFate);
        this.vertimeHours = vertimeHours;
    }

    public double getVertimeHours() {
        return vertimeHours;
    }

    public void setVertimeHours(double vertimeHours) {
        this.vertimeHours = vertimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + 12 * vertimeHours;
    }
}
