public class EmployeePerMonth implements Salary {

    int perday = 50;
    int monthday = 30;

    @Override
    public int salary() {
        return perday*monthday;
    }
}
