public class Main {

    public static void main(String[] args) {

        HourlyRateEmployee john = new HourlyRateEmployee("John");
        FixedMonthlyRateEmployee jack = new FixedMonthlyRateEmployee("Jack");
        System.out.println(john.getName() + "'s hourly salary is " + john.salary());
        System.out.println(jack.getName() + "'s fixed montly salary is " + jack.salary());

    }
}
