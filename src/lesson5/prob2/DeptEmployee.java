package lesson5.prob2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private double salary;
    private LocalDate hireFate;

    public DeptEmployee(String name, double salary, LocalDate hireFate) {
        this.name = name;
        this.salary = salary;
        this.hireFate = hireFate;
    }
    public double computeSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireFate() {
        return hireFate;
    }

    public void setHireFate(LocalDate hireFate) {
        this.hireFate = hireFate;
    }
}
