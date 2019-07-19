public class WorkerMonth implements Salary {
    private static final int Pay = 20000;
    private String name;

    public WorkerMonth(String name) {
        this.name = name;
    }

    @Override
    public int salary() {
        return Pay*Hours*Days*YearMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
