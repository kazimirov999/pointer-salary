package pointer.salary;

public class FixedSalary implements Salary {
    private double salary = 15000;
    private final int HOURS = 168;
    private int workedHours = 168;

    public void setWorkedHours(int hours)
    {
        workedHours = hours;
    }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public double salary() {
        return salary * workedHours / HOURS;
    }

    @Override
    public String toString() {
        return "Fixed salary";
    }
}
