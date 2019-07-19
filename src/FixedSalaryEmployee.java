package pointer.salary;

public class FixedSalaryEmployee implements Salary {
    private double salary = 15000;
    private final int HOURS = 168;
    private int workedHours = 168;

    public void setWorkedHours(int hours)
    {
        workedHours = hours;
    }

    @Override
    public double salary()
    {
        return salary * workedHours / HOURS;
    }
}
