public class FixedMonthlyRateEmployee implements Salary {

    private String name;

    FixedMonthlyRateEmployee(String name){

        this.name = name;

    }

    public int salary(){

        return FIXEDARRANGEMENT * MONTHES;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;
        
    }


}
