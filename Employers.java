public class Employers implements Salary {

    private String employer1;
    private String employer2;


    @Override
    public void MonthSalary() {
        this.employer1 = "Peter";
        System.out.println(employer1 + " зарабатывает " + SALARY);
    }

    @Override
    public void HoursSalary() {
        int hoursSalary = HOURLYRATE * HOURS;
        this.employer2 = "Ivan";
        System.out.println(employer2 + " зарабатывает " + hoursSalary);
    }
}

