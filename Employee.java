public class Employee implements Salary {


    private String name;

    Employee(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    @Override
    public void monthSalary() {
        System.out.println(getName() + " has a monthly salary : " + SALARY);

    }

    @Override
    public void hourlySalary() {
        int hourlySalary = HOURS * HOURLYRATE;
        System.out.println(getName() + " has an hourly salary : " + hourlySalary);

    }


}

