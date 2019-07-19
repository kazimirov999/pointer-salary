public class Main {

    public static void main(String[] args) {

	    HourlyRateEmployee john = new HourlyRateEmployee("John");
	    FixedMonthlyRateEmployee jack = new FixedMonthlyRateEmployee("Jack");
	    System.out.println("John's hourly salary is " + john.salary());
	    System.out.println("Jack's fixed montly salary is " + jack.salary());

    }
}
