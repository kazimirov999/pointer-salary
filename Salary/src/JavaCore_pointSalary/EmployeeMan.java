package JavaCore_pointSalary;

public class EmployeeMan implements Salary {

    private int salar = 10;


    @Override
    public void salary() {
        clock(8);
    }

    private void clock(int clok){
        int a = clok;
        int b = a * salar;
        System.out.println("Працівник №1 отримує " + b + " $ в день");
    }
}
