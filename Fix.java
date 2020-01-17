public class Fix implements Salary {

    private final int salary = 99;

    @Override
    public int salary() {
        System.out.println("Працівник з погодинною оплатою " + salary + " $ в день");
        return 0;
    }
}