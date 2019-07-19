public class WorkerHour implements Salary {
    private String name;
    private static final int pay = 50;

    public WorkerHour(String name) {
        this.name = name;
    }

    @Override
    public void salary() {
        System.out.println(name+" заробляє за місяць (без вихідних) == " + (pay * hours * days) + "$");
        System.out.println(name+" заробляє за рік (без вихідних та відпусток) == " + (pay * hours * days * yearMonth) + "$");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
