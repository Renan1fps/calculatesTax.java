package udemyCurso.taxes.classes;

public class NaturalPerson extends Person {
    private Double healthExpenses;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double Calculatestax() {
        double annualI = 0;
        if (super.annualIncome <= 20000) {
            annualI = super.annualIncome * 0.15;
        } else if (super.annualIncome >= 20000) {
            annualI = super.annualIncome * 0.25;


        }
        return annualI - healthExpenses * 0.5;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        healthExpenses = healthExpenses;
    }
}
