package pointer.salary;

public class RatePerHoursEmployee implements Salary {
    private double rate;

    private int workedHours;

    RatePerHoursEmployee(double rate) {
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

    @Override
    public String toString() {
        return "An employee with rate per hours";
    }
}

