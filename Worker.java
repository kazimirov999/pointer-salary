

import java.util.Scanner;
public class Worker implements ISalary{
    private int hours;
    private int days;
    private int sickLeaves;
    private int dayOnDemand;
    private int salary;


    // 1 is hourly and 0 for fixed salary. By default, it is fixed
    private int SALARY_TYPE = 0;
    Scanner scanner = new Scanner(System.in);
    public Worker(){
        getWorkerData();
    }

    private void getWorkerData(){
        System.out.println("Type of salary? Enter 0 for fixed, 1 for hourly: ");
        SALARY_TYPE = scanner.nextInt();
        if(SALARY_TYPE == 0){
            System.out.println("Enter total days: ");
            days = scanner.nextInt();
            System.out.println("Enter day on demand: ");
            dayOnDemand = scanner.nextInt();
            System.out.println("Enter number of sick leaves: ");
            sickLeaves = scanner.nextInt();
            salary = 72;
        }else if(SALARY_TYPE == 1){
            System.out.println("Enter total hours worked: ");
            hours = scanner.nextInt();
            salary = 8;
        }else{
            System.out.println("Invalid salary type entered! ");
        }

    }

    public void reportSalary() {
        double sal = calculateSalary();
        if(sal < 0)
            System.out.println("Invalid salary type detected");
        else
            System.out.println("Your wage is: " + (sal));
    }

    public double calculateSalary(){
        switch(SALARY_TYPE){
            case 0:
                return (days - sickLeaves - dayOnDemand)*salary;
            case 1:
                return hours > 160 ? salary*hours : salary*hours*1.1;
            default:
                return -1;
        }
    }
}
