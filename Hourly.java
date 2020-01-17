public class Hourly implements Salary {


    @Override
    public int salary() {
        int Hours = 8;
        int CashH = 15;
        int Summa;
        Summa = Hours * CashH;
        System.out.println("Працівник з фіксованою оплатою отримає " + Summa + " $ в день");
        return Summa;
    }
}
