package udemyCurso.taxes.classes;

public abstract class Person {
    protected String name;
    protected Double annualIncome;

    public Person() {
    }

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract Double Calculatestax();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
}
