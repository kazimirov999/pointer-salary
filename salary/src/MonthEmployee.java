public class MonthEmployee extends Employee implements Salary {

    private int monthSalary;

    public MonthEmployee(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public int salary() {
        return monthSalary * 12;
    }
}
