package lesson6.taska;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        DeptEmployee[] deptEmployees = DeptEmployeeData.getDeptData();
        Arrays.sort(deptEmployees, new NameComparator());
        for (DeptEmployee d :
                deptEmployees) {
            System.out.println(d);
        }
    }
}
