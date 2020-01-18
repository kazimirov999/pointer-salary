public class Main {
    public static void main(String[] args) {

        Salary employeeMonth = new EmployeeMonth();
        Salary employeeOneHour = new EmployeeOneHour();

        System.out.println(employeeMonth.salary() + "грн.");
        System.out.println(employeeOneHour.salary() + "грн.");

    }
}
