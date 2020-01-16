package JavaCore_pointSalary;

public class EmployeeWoman implements Salary {


    private final int salary = 500;

    @Override
    public void salary() {
        System.out.println("Працівник №2 отримує " + salary + " $ в місяць");
    }
}
