//Створити interface Зарплата, в якому передбачити метод зарплата(). Створити клас Працівник з погодинною зарплатою, та Працівник з фіксованою місячною зарплатою .
//Формула розрахунку зарплати працівника є довільною. Вивести на екран скільки заробляють перший і другий працівники.

public class SalaryExecution {
    public static void main(String[] args) {

        Salary employee1 = new Employee("Василь");
        Salary employee2 = new Employee("Микола");

        employee1.month();
        employee2.counter();

    }
}
