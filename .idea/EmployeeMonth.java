public class EmployeeMonth implements Salary {

    int day = 700;
    int monthday = 24;

    @Override
    public int salary() {
        return day*monthday;
    }
}
