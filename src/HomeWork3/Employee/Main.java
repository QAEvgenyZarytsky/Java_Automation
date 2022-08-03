package HomeWork3.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.testFront();

        System.out.println();


        Employee employee2 = new Employee("Nik", "Brons", 31);
        employee2.testFront();
        employee2.testBack();

        System.out.println();

       Employee employee3 = new Employee("Alexandra", "Storm", 28, "QA", "middle",
               1.6, "B2");
        employee3.testFront();
        employee3.testBack();
        employee3.testAuto();

        System.out.println();

        System.out.println(Employee.count);

    }
}
