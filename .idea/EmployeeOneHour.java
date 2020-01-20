public class EmployeeOneHour implements Salary {

    int hour = 110;
    int houratday = 12;
    int monthday = 24;

    @Override
    public int salary() {
        return hour * houratday * monthday;
    }
}
