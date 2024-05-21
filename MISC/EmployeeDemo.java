package MISC;
// create a class called employee with id, name and salary.
// create a method raiseSalary() which increases the salary by the given percentage.
// write suitable main method for demonstration

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID\tNAME\tSALARY");
        System.out.println(id+"\t"+name+"\t"+salary);
    }

    void raiseSalary(double percentage) {
        salary += salary*percentage/100;
        System.out.println("Increased salary by "+percentage+"%");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(0, "Baa", 5000);
        System.out.println("Emp details");
        emp.displayDetails();

        emp.raiseSalary(100);

        System.out.println("After raise:");
        emp.displayDetails();
    }
}
