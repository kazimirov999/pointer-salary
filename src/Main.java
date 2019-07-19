package pointer.salary;

public class Main {

    public static void main(String[] args) {
	    RatePerHoursEmployee employee1 = new RatePerHoursEmployee(90);
	    employee1.setWorkedHours(168);
		System.out.println("The first employee has rate per hour and " + employee1.salary() + " salary.");

	    FixedSalaryEmployee employee2 = new FixedSalaryEmployee();
		System.out.println("The second employee has fixed salary: " + employee2.salary() + ".");


	    Employee employee3 = new Employee(new FixedSalary());
	    employee3.setWorkedHours(140);
		System.out.println("The third employee fixed salary: " + employee3.salary() + ".");

	    employee3.setSalary(new RateSalary(90));
	    employee3.setWorkedHours(170);
		System.out.println("The third employee has rate per hour now and " + employee3.salary() + " salary.");
    }
}
