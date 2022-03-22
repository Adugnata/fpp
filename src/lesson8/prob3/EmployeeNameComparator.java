package lesson8.prob3;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Marketing> {
    @Override
    public int compare(Marketing o1, Marketing o2) {
        if(o1.getEmployeename().compareTo(o2.getEmployeename()) !=0)
            return o1.getEmployeename().compareTo(o2.getEmployeename());
        else {
            if(o1.getProductname().compareTo(o2.getProductname())!=0)
                return o1.getProductname().compareTo(o2.getProductname());
        }
        return Double.compare(o1.getSalesamount(),o2.getSalesamount());
    }
}
