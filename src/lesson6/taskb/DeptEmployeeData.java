package lesson6.taskb;

import lesson6.taska.DeptEmployee;
import lesson6.taska.Professor;
import lesson6.taska.Secretary;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;


public class DeptEmployeeData {

    public static DeptEmployee[] getDeptData() {
        Professor p0 = new Professor("Joe", 40000, LocalDate.of(1999, 12, 24));
        Professor p1 = new Professor("Bob", 50000, LocalDate.of(1979, 1, 2));
        Professor p2 = new Professor("Anna", 45000, LocalDate.of(2000, 5, 21));

        Secretary s0 = new Secretary("Joan", 50000, LocalDate.of(1987, 2, 15), 10);
        Secretary s1 = new Secretary("Janet", 40000, LocalDate.of(1995, 4, 22), 15);

        DeptEmployee[] department = {p0, p1, p2, s0, s1};
        return department;

    }

    private class NameComparator implements Comparator<DeptEmployee> {
        @Override
        public int compare(DeptEmployee e1, DeptEmployee e2) {
            return e1.getName().compareToIgnoreCase(e2.getName());
        }
    }

    private NameComparator sort() {
        return new NameComparator();
    }

    public static void main(String[] args) {
        DeptEmployee[] deptEmployees = DeptEmployeeData.getDeptData();
        DeptEmployeeData deptEmployee = new DeptEmployeeData();
        Arrays.sort(deptEmployees, deptEmployee.sort());
        for (DeptEmployee d : deptEmployees) {
            System.out.println(d);
        }
    }
}

