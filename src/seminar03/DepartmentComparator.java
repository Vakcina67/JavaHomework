package seminar03;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}
