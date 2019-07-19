public class WorkerMonth implements Salary {
    private static final int pay = 20000;
    private String name;

    public WorkerMonth(String name) {
        this.name = name;
    }

    @Override
    public void salary() {
        System.out.println(name+" заробляє за місяць == " + pay + "$");
        System.out.println(name+" заробляє за рік (без відпусток) == " + (pay * yearMonth) + "$");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
