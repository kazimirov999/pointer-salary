public class Main {
    public static void main(String[] args) {
        Employee pogodynnyk = new HourEmployee(200);
        Employee pomisyachnyk = new MonthEmployee(25000);

        System.out.println("Погодинник заробляє в рік " + pogodynnyk.salary() + " грн");
        System.out.println("Помісячник заробляє в рік " + pomisyachnyk.salary() + " грн");
    }
}
