public class EmployeePerHour implements Salary {

    int perhour = 3;
    int houratday = 8;
    int monthday = 30;

    @Override
    public int salary() {
        return perhour*houratday*monthday;
    }
}
