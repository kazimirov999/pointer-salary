

public interface Salary {

    class MonthSalary {
        public static final int SALARY = 19000;

        void setMonth() {
            System.out.println("Первый работник зарабатывает " + SALARY);
        }
    }
         static class HoursSalary {
             static final int HOURS = 150;
                 void setMonth() {
                 int hourlyRate = 80;
                 int hoursSalary = hourlyRate * HOURS;
                 System.out.println("Второй работник зарабатывает " +  hoursSalary);
             }
             public static class Main {

                 public static void main(String[] args) {
                    MonthSalary employer1 = new MonthSalary();
                    HoursSalary employer2 = new HoursSalary();

                     employer1.setMonth();
                     employer2.setMonth();
                 }
             }



         }
     }


