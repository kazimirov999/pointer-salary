public class Employee_hour implements Salary {
    private int hour = 8;
    private  int money = 60;
    private int salary = hour * money;

    @Override
    public int salary () {
        System.out.println("Зарплата Працівника " + salary + " в день за 8 годин");
        return 0;
    }


}
