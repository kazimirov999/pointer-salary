package pointer.salary;

public class Employee implements Salary {
    private Salary salary;

    Employee(Salary salary) {
        this.salary = salary;
    }

    void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void setWorkedHours(int workedHours) {
        this.salary.setWorkedHours(workedHours);
    }

    @Override
    public double salary() {
        return salary.salary();
    }
}
