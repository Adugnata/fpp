package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee {
    private String ssn;
    private String name;
    private double salary;
    public Employee(String ssn, String name, double aSalary) {
        this.name = name;
        this.ssn = ssn;
        this.salary = aSalary;
    }
    public String getName() {
        return name;
    }
    public String getSsn() {
        return ssn;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [ssn=" + ssn + ", name=" + name + ", salary=" + salary + "]";
    }
}
class TestEmployee {
    public static HashMap<String, Employee> convertHash(List<Employee> emps){
        HashMap<String,Employee> hm= new HashMap<>();
        for (Employee e: emps)
            hm.put(e.getSsn(),e);
        return hm;
    }
    public static List<String> names(HashMap<String, Employee> map){
        List<String> l= new ArrayList<>();
        for (Employee e: map.values())
            if(Double.compare(e.getSalary(), 5000)>0)
                l.add(e.getName());
        return l;}

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("234-23-4455", "Joe", 3450));
        list.add(new Employee("221-45-9990", "Mike", 5500));
        list.add(new Employee("876-99-7654", "Chelle", 8000));
        list.add(new Employee("564-66-6767", "Tom", 4000));
        list.add(new Employee("344-4-6654", "Anne", 3450));
        list.add(new Employee("123-45-6745", "Dan", 8000));
        list.add(new Employee("435-09-3425", "Bruen", 5000));
        HashMap<String, Employee> emap = convertHash(list);
        System.out.println(emap);
        List<String> name = names(emap);
        System.out.println("Names : " + name);
    }
}