public class WorkerMonth implements Salary {
    private static final int PAY = 20000;
    private String name;

    public WorkerMonth(String name) {
        this.name = name;
    }

    @Override
    public int salary() {
        return PAY*YEAR_MONTH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
