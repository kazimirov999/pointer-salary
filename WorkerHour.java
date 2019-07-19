public class WorkerHour implements Salary {
    private static final int Pay = 50;
    private String name;

    public WorkerHour(String name) {
        this.name = name;
    }

    @Override
    public int salary() {
        return Pay*Hours*Days*YearMonth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
