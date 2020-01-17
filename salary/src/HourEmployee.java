public class HourEmployee extends Employee implements Salary {

    private int hourSalary;

    public HourEmployee(int hourSalary) {
        this.hourSalary = hourSalary;
    }

    public int getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(int hourSalary) {
        this.hourSalary = hourSalary;
    }

    @Override
    public int salary() {
        return hourSalary * 2002;
    }
}
