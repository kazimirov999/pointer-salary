public class WorkerHour implements Salary {
    private static final int PAY = 50;
    private String name;

    public WorkerHour(String name) {
        this.name = name;
    }

    @Override
    public int salary() {
        return PAY*HOURS*DAYS*YEAR_MONTH;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
