public class Main {
    public static void main(String[] args) {
        Salary employee = new EmployeePerHour();
        System.out.println(employee.salary());
        Salary employee2 = new EmployeePerMonth();
        System.out.println(employee2.salary());

    }
}
