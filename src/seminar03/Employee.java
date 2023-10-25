package seminar03;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;
    private String department;

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getSalary() {return salary;}
    public String getDepartment() {return department;}

    public String toString() {
        return this.name + " " + this.age + " " + this.salary + " " + this.department;
    }

    public int compareTo(Employee e) {
        return this.age - e.age;
    }
    public Employee(String name, int age, int salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
}
