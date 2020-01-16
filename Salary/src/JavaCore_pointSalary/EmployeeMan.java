package JavaCore_pointSalary;

public class EmployeeMan implements Salary {

    private int salar = 10;
    public int workDay = 24;


    @Override
    public void salary() {
        clock(8);
    }

    private void clock(int clok){
        int a = clok;
        int b = a * salar;
        int c = b *workDay;
        System.out.println("Працівник №1 отримує " + c + " $ в місяць");
    }
}
