public class HourlyRateEmployee implements Salary {

    private String name;

    HourlyRateEmployee(String name){

         this.name = name;

    }

    public int salary(){

        return HOURS * HOURLYARRANGEMENT * DAYS;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

}
