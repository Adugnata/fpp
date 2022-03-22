package lesson6.taska;

import java.util.Comparator;

public class NameComparator implements Comparator<DeptEmployee> {
    @Override
    public int compare(DeptEmployee e1, DeptEmployee e2) {
        return e1.getName().compareToIgnoreCase(e2.getName());
    }
}
