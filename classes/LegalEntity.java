package udemyCurso.taxes.classes;

public class LegalEntity extends Person {
    private Integer numberEmployees;

    public LegalEntity() {
        super();

    }

    public LegalEntity(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double Calculatestax() {
        double annualI;
        if (this.numberEmployees>=10){
            annualI= super.annualIncome*0.14;
        }
        else {
            annualI=super.annualIncome*0.16;
        }
        return annualI;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
}
