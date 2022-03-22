package lesson8.prob3;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> l = new ArrayList<>();
        for (Marketing m : list
        ) {
            if (m.getSalesamount() > 1000)
                l.add(m);
        }

        return l;
    }

    public static void main(String[] args) {

        List<Marketing> marketingList = new ArrayList<>();

        // adding objects to the Marketing
        marketingList.add(new Marketing("Maria", "laptop", 10000));
        var v1 = new Marketing("Tom", "iPad", 20000);
        var v2 = new Marketing("Rachel", "Book", 5000);
        var v3 = new Marketing("John", "Jewellery", 3000);
        var v4 = new Marketing("John", "Jewellery", 2000);
        var v5 = new Marketing("Zara", "Bicycle", 999);

        marketingList.addAll(List.of(v1, v2, v3, v4, v5));

        //delete v1 object from Marketing
        marketingList.remove(v1);

        // Print the size of the list
        System.out.println("size = " + marketingList.size());
        /**
         * sort the list in natural order for the field salesamount
         * using comparator interface.
         */
        marketingList.sort((o1, o2) -> {
            if (Double.compare(o1.getSalesamount(), o2.getSalesamount()) != 0)
                return Double.compare(o1.getSalesamount(), o2.getSalesamount());
            if (o1.getEmployeename().compareTo(o2.getEmployeename()) != 0)
                return o1.getEmployeename().compareTo(o2.getEmployeename());

            return o1.getProductname().compareTo(o2.getProductname());
        });
        System.out.println("sorted in natural order by salesamount:");
        for (Marketing m : marketingList) {
            System.out.println(m);
        }
        List<Marketing> listmorethan1000 = listMoreThan1000(marketingList);
        /**
         * Sort the list in natural order using employeename
         * with the criteria of the employee who achieves more than $1000 of salesamount.
         */
        listmorethan1000.sort(new EmployeeNameComparator());
        System.out.println("Sorted in natural order by employeename");
        for (Marketing m : listmorethan1000) {
            System.out.println(m);
        }

    }
}
