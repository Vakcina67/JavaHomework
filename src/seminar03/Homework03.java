package seminar03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Homework03 {
    public static void main(String[] args) {
        Random r = new Random();
        String[] nameList = new String[]{"Evgeniy", "Vladimir", "Sergey",
                "Artur", "Elena", "Svetlana", "Oleg", "Olga", "Alexey", "Lubov"};
        String[] departmentList = new String[]{"Quality", "PR", "Manufacture",
                "Sales", "Laboratory", "Insurance"};
        List<Employee> db = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            db.add(new Employee(nameList[r.nextInt(nameList.length)],
                    r.nextInt(18, 65),
                    r.nextInt(35000, 150000),
                    departmentList[r.nextInt(departmentList.length)]));
        }
        System.out.println("Сортировка по увеличению возраста");
        Collections.sort(db);
        for (Employee employee : db) {
            System.out.println(employee);
        }
        System.out.println("Сортировка по убыванию зарплат");
        SalaryComparator sCompare = new SalaryComparator();
        db.sort(sCompare);
        for (Employee employee : db) {
            System.out.println(employee);
        }
        System.out.println("Сортировка по департаментам");
        DepartmentComparator dCompare = new DepartmentComparator();
        db.sort(dCompare);
        for (Employee employee : db) {
            System.out.println(employee);
        }
    }
}
