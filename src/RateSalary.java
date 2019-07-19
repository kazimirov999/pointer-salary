package pointer.salary;

public class RateSalary implements Salary {
    private double rate;

    private int workedHours;

    RateSalary(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public double salary() {
        return workedHours * rate;
    }
}
