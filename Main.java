public class Main {
    public static void main(String [] args){
        WorkerHour ivan=new WorkerHour("Иван");
        WorkerMonth petr=new WorkerMonth("Петр");

        System.out.println(ivan.getName()+" заробляє за рік (без вихідних та відпусток) == " + ivan.salary() + "$");
        System.out.println(petr.getName()+" заробляє за рік (без відпусток) == " + petr.salary() + "$");

    }
}
