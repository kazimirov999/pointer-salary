public class Employee implements Salary {
   private int salary = 500;

   @Override
        public int salary () {
            System.out.println("Зарплата Працівника " + salary + " в день");
            return 0;
        }
    }

