//Створити interface Зарплата, в якому передбачити метод зарплата(). Створити клас Працівник з погодинною зарплатою, та Працівник з фіксованою місячною зарплатою .
//Формула розрахунку зарплати працівника є довільною. Вивести на екран скільки заробляють перший і другий працівники.

import java.sql.SQLOutput;

public class Employee implements Salary {

    static {
        System.out.println("Розрахунок зарплатні...\n");
    }

    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChecker() {
        return checker;
    }

    public void setChecker(int checker) {
        this.checker = checker;
    }

    private int checker = Salary.DAILY;

    @Override
    public void counter() {
        System.out.print("Плата за годину роботи працівнику: " + checker);
        for (int i = 0; i <= 184; i++){

            checker += Salary.DAILY;
        }
        System.out.println(". Сума за місяць: " + checker + " у працівника " + getName());
        System.out.println();
    }

    public void month (){
        System.out.println("Помісячна зарплатня: " + Salary.MONTHLY + " працівника " + getName());
        System.out.println();
    }
}
